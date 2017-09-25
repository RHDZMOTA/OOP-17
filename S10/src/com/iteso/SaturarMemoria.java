package com.iteso;

@SuppressWarnings("ALL")
public class SaturarMemoria {
    public static void main(String[] args) {
        for (int n = 0; n < 10000; n++) {
            double[] M = new double[10000000];
            M[0] = Math.random() * 1000;
            System.out.println(M[0]);
        }
    }
}
