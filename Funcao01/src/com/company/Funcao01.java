package com.company;

public class Funcao01 {
    //Procedimento soma
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa...");
        soma(5, 2);
    }
}
