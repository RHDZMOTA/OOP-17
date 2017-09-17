package tests;

import shape2d.Rectangle;

@SuppressWarnings("ALL")
public class TestRetangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 6.5);

        Rectangle r2 = new Rectangle(2 * r1.getHeight(), r1.perimeter() / 2);

        Rectangle r3 = new Rectangle(r1.area(), r2.getBase());

        r1.print();
        r2.print();
        r3.print();
    }
}
