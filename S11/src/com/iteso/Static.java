package com.iteso;

@SuppressWarnings("all")
public class Static {
    private static int s = 0;
    private int n = 0;
    public static final int ROUNDED = 10;

    public Static() {
        s += 2;
        n += 2;
    }

    public int getSuma() {
        return s + n;
    }


    @Override
    public String toString() {
        return "s: " + s + ", n: " + n;
    }

    public static void main(String[] args) {
        Static o1 = new Static();
        System.out.println("-----------");
        System.out.println(o1);

        Static o2 = new Static();
        System.out.println("-----------");
        System.out.println(o1);
        System.out.println(o2);

        Static o3 = new Static();
        System.out.println("-----------");
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

    }
}

