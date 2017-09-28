package com.iteso;

@SuppressWarnings("all")
public class TestStatic {

    public static void main(String[] args) {

        int value = Static.ROUNDED;

        Static s1 = new Static();
        int value2 = s1.ROUNDED;
    }

}
