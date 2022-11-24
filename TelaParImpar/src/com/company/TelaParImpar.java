package com.company;

import java.util.Scanner;

public class TelaParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = teclado.nextInt();
        if (valor%2==0) {
            System.out.println("Par.");
        }else {
            System.out.println("Ímpar.");
        }
    }
}
