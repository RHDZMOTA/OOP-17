package com.iteso.test;

@SuppressWarnings("all")
public class A {
    public void m4() {
        System.out.println("Método M4 de A.");
    }
}

class B extends A {
    public void m4() {
        System.out.println("Método M4 de B.");
    }
}

class C extends B {
    public void m4() {
        System.out.println("Método M4 de C.");
    }
}