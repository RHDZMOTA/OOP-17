package com.iteso.shapes;

@SuppressWarnings("all")
public class Cylinder extends Shape3D {

    protected double radius;
    protected double height;

    public Cylinder(double x, double y, double z, double r, double h) {
        super(x, y, z);
        setRadius(r);
        setHeight(h);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius > 0) ? radius : 1;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = (height > 0) ? height : 1;
    }

    @Override
    public double area() {
        return 2 * Math.PI * Math.pow(getRadius(), 2) + 2 * getHeight() * Math.PI * getRadius();
    }

    @Override
    public double volume() {
        return getHeight() * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Radius: " + getRadius() + "\n" +
                "Height: " + getHeight() + "\n" +
                super.toString();
    }
}
