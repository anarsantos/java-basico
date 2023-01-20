package com.company;

import java.util.Scanner;

public class VetorOpcoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int [5];
        Integer numerosDigitados[] = new Integer[vetor.length];

        for (int contador = 0; contador <5; contador++) {
            System.out.print("Digite 5 números entre 0 e 5: ");
            numerosDigitados[contador] = teclado.nextInt();
            if (numerosDigitados[contador] < 0 || numerosDigitados[contador] > 5) {
                System.out.println("Número inválido, por favor, digite um número entre 0 e 5.");
            } else {
                vetor[contador] = numerosDigitados[contador];
                System.out.println("[" + numerosDigitados[contador] + "]");
            }
        }
    }
}
