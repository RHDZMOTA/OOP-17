package com.iteso.model;

@SuppressWarnings("ALL")
public class RGBColor {

    private int red;
    private int green;
    private int blue;
    private String name;

    public RGBColor(){
        this(0, 0, 0, "Negro");
    }

    public RGBColor(int red, int green, int blue, String name) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
        setName(name);
    }

    private int getColor(int color) {
        if (color >= 0 && color <= 255)
            return color;
        else if (color < 0)
            color = 0;
        else
            color = 255;
        return color;
    }

    public int getRed() {
        return this.red;
    }

    public void setRed(int red) {
        this.red = getColor(red);
    }

    public int getGreen() {
        return this.green;
    }

    public void setGreen(int green) {
        this.green = getColor(green);
    }

    public int getBlue() {
        return this.blue;
    }

    public void setBlue(int blue) {
        this.blue = getColor(blue);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRGB() {
        return 65536 * red + 256 * green + blue;
    }

    public String getHex() {
        return String.format("#%02x%02x%02x", red, green, blue).toUpperCase();
    }
}
