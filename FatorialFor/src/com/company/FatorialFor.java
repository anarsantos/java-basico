package com.company;

import java.util.Scanner;

public class FatorialFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //int numero;
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        int fatorial = 1;

        for (int contador = numero; contador >= 1; contador--) {
            fatorial *= contador;
        }
        System.out.println("O fatorial de " + numero + "! é " + fatorial);
    }
}
