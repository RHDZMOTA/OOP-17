package com.iteso.test;

import com.iteso.model.RGBColor;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

public class TestRGBColor {

    public static void main(String[] args){

        RGBColor rgbColor = new RGBColor(80, 200, 120, "I don't care");
        System.out.println(rgbColor.getRGB());
        System.out.println(rgbColor.getHex());

        RGBColor c1 = new RGBColor(80, 200, 120, "Esmeralda");
        System.out.println(c1.getRGB());
        System.out.println(c1.getHex());

        RGBColor c2 = new RGBColor(220, 20, 60, "Carmesí");
        System.out.println(c2.getRGB());
        System.out.println(c2.getHex());

        RGBColor c3 = new RGBColor(18, 10, 143, "Azul marino");
        System.out.println(c3.getRGB());
        System.out.println(c3.getHex());


    }

}
