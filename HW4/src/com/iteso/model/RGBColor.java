package com.iteso.model;

public class RGBColor {

    private int red;
    private int green;
    private int blue;
    private int cyan;
    private int magenta;
    private int yellow;
    private String name;

    public RGBColor(int red, int green, int blue, String name) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
        setName(name);
    }

    public RGBColor() {
        this(0,0,0,"Negro");
    }

    public void setRGBColor(int rgbColor) {
        int red = (rgbColor >> 16) & 0xFF;
        int green = (rgbColor >> 8) & 0xFF;
        int blue = (rgbColor >> 0) & 0xFF;
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }


    public void setCMYColor(int cmyColor) {
        int cyan = (cmyColor >> 16) & 0xFF;
        int magenta = (cmyColor >> 8) & 0xFF;
        int yellow = (cmyColor >> 0) & 0xFF;
        setCyan(cyan);
        setMagenta(magenta);
        setYellow(yellow);
    }

    public int getCMY() {
        return getCyan() * 65536 + getMagenta() * 256 + getYellow();
    }

    public int getCyan() { return this.cyan; }

    public void setCyan(int cyan) {
        this.cyan = getColor(cyan);
        this.red = getComplement(getCyan());
    }

    public int getMagenta() { return this.magenta; }

    public void setMagenta(int magenta) {
        this.magenta = getColor(magenta);
        this.green = getComplement(getMagenta());
    }

    public int getYellow() { return this.yellow; }

    public void setYellow(int yellow) {
        this.yellow = getColor(yellow);
        this.blue = getComplement(getYellow());
    }

    public int getRed() {
        return red;
    }

    private void setRed(int red) {
        this.red = getColor(red);
        this.cyan = getComplement(getRed());
    }

    public int getGreen() {
        return green;
    }

    private void setGreen(int green) {
        this.green = getColor(green);
        this.magenta = getComplement(getGreen());
    }

    public int getBlue() {
        return blue;
    }

    private void setBlue(int blue) {
        this.blue = getColor(blue);
        this.yellow = getComplement(getBlue());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null)
            this.name = name;
        else
            this.name = "Black";
    }

    private int getColor(int color) {
        if(color >= 0 && color <= 255)
            return color;
        else if (color < 0)
            color = 0;
        else
            color = 255;
        return color;
    }

    private int getComplement(int color) {
        return 255 - color;
    }

    public int getRGB(){
        return getRed() * 65536 + getGreen() * 256 + getBlue();
    }

    public String getHex() {
        return String.format("#%02x%02x%02x", getRed(), getGreen(), getBlue()).toUpperCase();
    }

    @Override
    public String toString() {
        return "RGBColor{" +
                "red=" + getRed() +
                ", green=" + getGreen() +
                ", blue=" + getBlue() +
                ", cyan=" + getCyan() +
                ", magenta=" + getMagenta() +
                ", yellow=" + getYellow() +
                ", name='" + getName() + '\'' +
                '}' +
                "\nAdditional info:" +
                "\n> (RGB) Hex : " + getHex() +
                "\n> (RGB) Integer : " + getRGB() +
                "\n> (CMY) Integer : " + getCMY();
    }
}
