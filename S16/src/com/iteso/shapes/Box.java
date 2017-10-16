package com.iteso.shapes;

@SuppressWarnings("all")
public class Box extends Shape3D {

    protected double width, height, depth;

    public Box(double x, double y, double z, double width, double height, double depth){
        super(x, y, z);
        setWidth(width);
        setHeight(height);
        setDepth(depth);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 1;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth > 0 ? depth : 1;
    }

    @Override
    public double area() {
        return 2 * getHeight() * (getWidth() + getDepth());
    }

    @Override
    public double volume() {
        return getWidth() * getHeight() * getDepth();
    }

    @Override
    public String toString() {
        return "Width: " + getWidth() + "\n" +
                "Height: " + getHeight() + "\n" +
                "Depth: " + getDepth() + "\n" +
                super.toString();
    }
}
