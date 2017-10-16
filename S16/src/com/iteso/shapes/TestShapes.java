package com.iteso.shapes;

@SuppressWarnings("all")
public class TestShapes {

    public static void  main(String[] args) {

        Sphere sphere = new Sphere(1,2,3,4.5);
        Cylinder cylinder = new Cylinder(1,2,3,4.5, 5);
        Box box = new Box(1,2,3,4.5, 7, 8);

        Shape3D myShapes[] = new Shape3D[] {sphere, cylinder, box};

        for (Shape3D shape : myShapes) {
            System.out.println("--------------");
            System.out.println(shape);
        }

    }

}
