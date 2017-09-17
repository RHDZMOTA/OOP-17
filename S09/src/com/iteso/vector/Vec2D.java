package com.iteso.vector;

@SuppressWarnings("all")
public class Vec2D {

    private double x;
    private double y;

    public void toUnit(double x, double y) {
        double m = Math.sqrt(x * x + y * y);
        x /= m;
        y /= m;
    }

    public void toUnit(Vec2D p) {
        double m = Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY());
        p.setX(p.getX() / m);
        p.setY(p.getY() / m);
    }

    public static void main(String[] args){
        Vec2D vec2D = new Vec2D();
        double x = 5;
        double y = 10;

        vec2D.toUnit(x, y);
        System.out.println("x : " + x + " y: " + y);

        Vec2D vec = new Vec2D();
        vec.setX(x);
        vec.setY(y);
        vec.toUnit(vec);
        System.out.println("x : " + vec.getX() + " y: " + vec.getY());
        System.out.println("x : " + x + " y: " + y);
        System.out.println(vec);

        vec.setX(5);
        vec.setY(10);
        vec2D.setX(5);
        vec2D.setY(10);
        if (vec2D.equals(vec)) {
            System.out.println("Vectores iguales");
        } else {
            System.out.println("Vectores diferentes");
        }
        
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vec2D)) return false;

        Vec2D vec2D = (Vec2D) o;

        if (Double.compare(vec2D.getX(), getX()) != 0) return false;
        if (Double.compare(vec2D.getY(), getY()) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Vec2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public Vec2D clone() {
        return new Vec2D(this.x, this.y);
    }

    public Vec2D() {

    }

    public Vec2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
