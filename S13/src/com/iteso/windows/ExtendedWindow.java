package com.iteso.windows;

@SuppressWarnings("all")
public class ExtendedWindow extends BasicWindow {

    public final int MAX_X = 1200, MAX_Y = 1000;
    protected String title;

    public ExtendedWindow(int x, int y, int width, int height){
        super(x ,y, width, height);
    }

    public ExtendedWindow(int x, int y, int width, int height, String title){
        this(x, y, width, height);
        this.title = title;
    }

    public static void main(String[] args){
        ExtendedWindow window = new ExtendedWindow(20, 20, 10, 10);
    }

    public void move(int dx, int dy) {
        setX(dx);
        setY(dy);
    }

    public void display() {
        System.out.println("Title: " + this.title);
        super.display();
    }

    @Override
    public void setX(int x) {
        this.x = (x < 0) ? 0 : (MAX_X < x) ? MAX_X - 1 : x;
    }

    @Override
    public void setY(int y) {
        this.y = (y < 0) ? 0 : (MAX_Y < y) ? MAX_Y - 1 : y;
    }
}
