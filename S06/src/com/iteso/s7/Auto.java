package com.iteso.s7;

public class Auto {
    int color;
    Llanta[] llantas;
    Motor motor;
    String marca;
    float gasolina;

    boolean arrancar() {
        gasolina -= 1f;
        motor.arrancar();
        return true;
    }
}
