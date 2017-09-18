package com.iteso.s7;

public class Motor {

    float torque;
    String marca;
    String numeroSerie;
    double bujia;

    boolean arrancar() {
        bujia++;
        return true;
    }
}
