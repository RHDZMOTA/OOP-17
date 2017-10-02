package com.iteso.windows;

@SuppressWarnings("all")
public class BasicWindow {
    public final int MIN_WIDTH = 10;
    public final int MIN_HEIGHT = 15;
    protected int x, y, width, height;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x < 0 ? 0 : x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y < 0 ? 0 : y;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width < MIN_WIDTH ? MIN_WIDTH : width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height < MIN_HEIGHT ? MIN_HEIGHT : height;
    }

    public BasicWindow() {
        x = y = 0;
        width = MIN_WIDTH;
        height = MIN_HEIGHT;
    }

    public BasicWindow(int x, int y, int width, int height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    public void display() {
        System.out.println("Location: (" + getX() + ", " + getY() + ")");
        System.out.println("Dimentions: (" + getWidth() + ", " + getHeight() + ")");
    }

    public void resize(int dw, int dh) {
        setWidth(getWidth() + dw);
        setHeight(getHeight() + dh);
    }

}
