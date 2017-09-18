package com.iteso.model;

@SuppressWarnings("all")
public class RGBColor {

    private int red;
    private int green;
    private int blue;
    private int cyan;
    private int magenta;
    private int yellow;
    private String name;

    /**
     * RGBColor constructor.
     * @param red integer that represents the red component of an rgb-color.
     * @param green integer that represents the green component of an rgb-color.
     * @param blue integer that represents the blue component of an rgb-color.
     * @param name string that indicates the name of the color.
     */
    public RGBColor(int red, int green, int blue, String name) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
        setName(name);
    }


    /**
     * Constructor that sets the default color to black.
     */
    public RGBColor() {
        this(0,0,0,"Negro");
    }

    /**
     * Setter that allows to adjust the properties of the class to a given rgb-color in its integer form.
     * @param rgbColor integer rgb-color.
     */
    public void setRGBColor(int rgbColor) {
        int red = (rgbColor >> 16) & 0xFF;
        int green = (rgbColor >> 8) & 0xFF;
        int blue = (rgbColor >> 0) & 0xFF;
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    /**
     * Setter that allows to adjust the properties of the class to a given cmy-color.
     * @param cmyColor integer cmy-color.
     */
    public void setCMYColor(int cmyColor) {
        int cyan = (cmyColor >> 16) & 0xFF;
        int magenta = (cmyColor >> 8) & 0xFF;
        int yellow = (cmyColor >> 0) & 0xFF;
        setCyan(cyan);
        setMagenta(magenta);
        setYellow(yellow);
    }

    /**
     * Getter of the integer representation of the cmy-color.
     * @return integer cmy-color.
     */
    public int getCMY() {
        return getCyan() * 65536 + getMagenta() * 256 + getYellow();
    }

    /**
     * Getter of the cyan component of the color.
     * @return integer cyan.
     */
    public int getCyan() { return this.cyan; }

    /**
     * Setter of the cyan/red-complement components of the general color.
     * @param cyan integer representing the cyan component.
     */
    public void setCyan(int cyan) {
        this.cyan = getColor(cyan);
        this.red = getComplement(getCyan());
    }

    /**
     * Getter for the magenta component of the general color.
     * @return integer magenta.
     */
    public int getMagenta() { return this.magenta; }

    /**
     * Setter of the magenta/green-complement component of the general color.
     * @param magenta integer representing the magenta component.
     */
    public void setMagenta(int magenta) {
        this.magenta = getColor(magenta);
        this.green = getComplement(getMagenta());
    }

    /**
     * Getter of the yellow component of the general color.
     * @return integer yellow.
     */
    public int getYellow() { return this.yellow; }

    /**
     * Setter of the yellow/blue-complement component of the general color.
     * @param yellow integer representing the yellow component.
     */
    public void setYellow(int yellow) {
        this.yellow = getColor(yellow);
        this.blue = getComplement(getYellow());
    }

    /**
     * Getter of the red component of the general color.
     * @return integer red.
     */
    public int getRed() {
        return red;
    }

    /**
     * Setter for the red component of the general color.
     * @param red integer representing the red component.
     */
    private void setRed(int red) {
        this.red = getColor(red);
        this.cyan = getComplement(getRed());
    }

    /**
     * Getter for the green component of the general color.
     * @return integer green.
     */
    public int getGreen() {
        return green;
    }

    /**
     * Setter for the green component of the general color.
     * @param green integer representing the green component.
     */
    private void setGreen(int green) {
        this.green = getColor(green);
        this.magenta = getComplement(getGreen());
    }

    /**
     * Getter for the blue component of the general color.
     * @return integer blue.
     */
    public int getBlue() {
        return blue;
    }

    /**
     * Setter for the blue component of the general color.
     * @param blue integer representing the blue component.
     */
    private void setBlue(int blue) {
        this.blue = getColor(blue);
        this.yellow = getComplement(getBlue());
    }

    /**
     * Getter for the color name.
     * @return String color name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the color name.
     * @param name String representing the color's name.
     */
    public void setName(String name) {
        if(name != null)
            this.name = name;
        else
            this.name = "Black";
    }

    /**
     * Private method to validate a color.
     * @param color integer value probably representing a color (rgb).
     * @return integer from 0 to 255.
     */
    private int getColor(int color) {
        if(color >= 0 && color <= 255)
            return color;
        else if (color < 0)
            color = 0;
        else
            color = 255;
        return color;
    }

    /**
     * Private method that calculates the complement of a color.
     * @param color integer from 0 to 255.
     * @return integer representing the complement of the input-color.
     */
    private int getComplement(int color) {
        return 255 - color;
    }

    /**
     * Getter of the integer representation of an rgb-color.
     * @return integer rgb-color.
     */
    public int getRGB(){
        return getRed() * 65536 + getGreen() * 256 + getBlue();
    }

    /**
     * Getter of the hexadecimal representation of a rgb-color.
     * @return String representing the hex of the color.
     */
    public String getHex() {
        return String.format("#%02x%02x%02x", getRed(), getGreen(), getBlue()).toUpperCase();
    }

    /**
     * To string method.
     * @return Information of the class as a string.
     */
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
