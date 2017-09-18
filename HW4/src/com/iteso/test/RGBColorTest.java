package com.iteso.test;

import com.iteso.model.RGBColor;

public class RGBColorTest {

    public static void main(String[] args) {

        // Test that shows the initialization of the class given the values of an rgb-color.
        System.out.println("---------------------");
        System.out.println("* Test 1: Initialize an instance with each component of an rgb-color.");
        RGBColor rgbColor1 = new RGBColor(128, 0, 0, "Maroon");
        System.out.println(rgbColor1.toString());

        // Test that shows the setters attributes for a given value of each cmy-color.
        System.out.println("---------------------");
        System.out.println("* Test 2: Setters for each component of an cmy-color.");
        RGBColor rgbColor2 = new RGBColor();
        rgbColor2.setCyan(0);
        rgbColor2.setMagenta(0);
        rgbColor2.setYellow(255);
        rgbColor2.setName("Yellow");
        System.out.println(rgbColor2.toString());

        // Test that shows the conversion among RGB to CMY.
        // The following 2 tests are based on this results.
        System.out.println("---------------------");
        System.out.println("* Test 3: Get the integer representation for rgb and cmy of a rgb-color by its components.");
        RGBColor rgbColor3 = new RGBColor(0, 255, 255, "cyan");
        System.out.println(rgbColor3.toString());

        // Test that shows the transformation between the 32 bit representation of a rgb-color to its basic components.
        System.out.println("---------------------");
        System.out.println("* Test 4: Setter for a 32 bit representation (integer) of a rgb-color.");
        RGBColor rgbColor4 = new RGBColor();
        rgbColor4.setRGBColor(65535);
        rgbColor4.setName("cyan");
        System.out.println(rgbColor4.toString());

        // Test that shows the transformation between the 32 bit representation of a cmy-color to its basic components.
        System.out.println("---------------------");
        System.out.println("* Test 5: Setter for a 32 bit representation (integer) of a cmy-color.");
        RGBColor rgbColor5 = new RGBColor();
        rgbColor5.setCMYColor(16711680);
        rgbColor5.setName("cyan");
        System.out.println(rgbColor5.toString());


        // Test that shows how to get the integer value for a cmy-color.
        System.out.println("---------------------");
        System.out.println("* Test 6: Getter of the integer value of a cmy-color.");
        RGBColor rgbColor6 = new RGBColor();
        rgbColor6.setCMYColor(16711680);
        rgbColor6.setName("cyan");
        System.out.println("Integer value of an cmy-color (cyan): " + rgbColor5.getCMY());


        // Test that shows how to get from black to white while setting the same values into rgb-color and cmy-color.
        System.out.println("---------------------");
        System.out.println("* Test 7: Black to white.");
        RGBColor rgbColor7 = new RGBColor(0,0,0,"black");
        System.out.println(rgbColor7.toString());
        rgbColor7.setCyan(0);
        rgbColor7.setMagenta(0);
        rgbColor7.setYellow(0);
        rgbColor7.setName("White");
        System.out.println(rgbColor7.toString());


    }
}
