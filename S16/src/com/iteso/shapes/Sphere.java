package com.iteso.shapes;

@SuppressWarnings("all")
public class Sphere extends Shape3D {

    protected double radius;

    public Sphere(double x, double y, double z, double r) {
        super(x, y, z);
        setRadius(r);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius > 0) ? radius : 1;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double volume() {
        return 4 * Math.PI * Math.pow(getRadius(), 3) / 3;
    }

    @Override
    public String toString() {
        return "Radius: " + getRadius() + "\n" + super.toString();
    }
}
