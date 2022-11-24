package com.company;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c;

        System.out.print("Escreva o valor de a: ");
        a = teclado.nextInt();
        System.out.print("Escreva o valor de b: ");
        b = teclado.nextInt();
        System.out.print("Escreva o valor de c: ");
        c = teclado.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("O valor de delta " + delta);

        if (delta < 0) {
            System.out.println("Não existem raizes reais.");
        } else {
            System.out.println("Existem raizes reais.");
        }
    }
}
