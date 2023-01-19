package com.company;

import java.util.Scanner;

public class VetorOpcoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int [5];
        int numerosDigitados[] = new int[0];

        for (int contador = 0; contador <5; contador++) {
            System.out.print("Digite 5 números entre 0 e 5: ");
            numerosDigitados[contador] = teclado.nextInt();
        }


        if (numerosDigitados < 0) {
            System.out.println("Número inválido, por favor, digite um número entre 0 e 5");
        } else {

            vetor[0] = numerosDigitados;
            System.out.println(vetor[0]);


        }
    }
}
