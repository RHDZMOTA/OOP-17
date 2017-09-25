package com.iteso;

public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 5);
        Rectangle r2 = new Rectangle(15, 5);
        Rectangle r3 = new Rectangle(25, 5);

        r2 = new Rectangle(50, 50);
        System.gc();

        r1.print();
        r2.print();
        r3.print();

    }

}
