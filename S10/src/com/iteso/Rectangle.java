package com.iteso;

@SuppressWarnings("ALL")
public class Rectangle {

    private double base;
    private double height;

    public Rectangle(){
        this(1, 1);
    }

    public Rectangle(double height, double base){
        this.setBase(base);
        this.setHeight(height);
    }

    public void setBase(double base) {
        if (base >= 1 && base <= 100)
            this.base = base;
        else
            this.base = 1;
    }

    public void setHeight(double h) {
        if (h >= 1 && h <= 100)
            height = h;
        else
            this.height = 1;
    }

    @Override
    protected void finalize(){
        System.out.println("Se destruye " + toString());
    }

    @Override
    public String toString(){
        return base + ", " + height;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle geRectangle() {
        return this;
    }

    public double area() {
        return base * height;
    }

    public double perimeter() {
        return 2 * base + 2 * height;
    }

    public void print() {
        System.out.println(base + ", " + height + ", " + area()  + ", " + perimeter());
    }

}
