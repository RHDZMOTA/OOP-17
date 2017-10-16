package com.iteso.shapes;

@SuppressWarnings("all")
public abstract class Shape3D {

    protected double x, y, z;

    public Shape3D(double x, double y, double z){
        setX(x);
        setY(y);
        setZ(z);
    }

    public abstract double area();

    public abstract double volume();

    public void move(double dx, double dy, double dz){
        setX(getX() + dx);
        setY(getY() + dy);
        setZ(getZ() + dz);
    }

    @Override
    public String toString() {
        return "Coordinates: <" + getX() + ", " + getY() + ", " + getZ() + ">\n" +
                "Area = " + area() + "\n" +
                "Volumen = " + volume();
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
