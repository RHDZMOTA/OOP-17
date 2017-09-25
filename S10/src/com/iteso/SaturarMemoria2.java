package com.iteso;

public class SaturarMemoria2 {
    public static void main(String[] args) {
        for (int n = 0; n < 10000; n++) {
            DoubleArray[] M = new DoubleArray[10];
            M[0] = new DoubleArray(n, Math.random() * 1000);
            System.out.println(M[0]);
        }
    }
}
