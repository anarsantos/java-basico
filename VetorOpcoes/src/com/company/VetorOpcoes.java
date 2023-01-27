package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class VetorOpcoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int [5];
        int numerosDigitados;

        for (int contador = 0; contador <5; contador++) {
            System.out.print("Digite 5 números entre 0 e 5: ");
            numerosDigitados = teclado.nextInt();
            if (numerosDigitados < 0 || numerosDigitados > 5) {
                System.out.println("Número inválido, por favor, digite um número entre 0 e 5.");
            } else {
                vetor[contador] = numerosDigitados;
                System.out.println("Índice: " + contador + ". Valor inserido: [" + numerosDigitados + "]");
            }
        }

        System.out.print("REMOVA um número da lista: ");
        int numeroRemovido = teclado.nextInt();
        for (int contador = 0; contador <5; contador++) {
            if (vetor[contador] == numeroRemovido) {

                vetor[contador] = 0;
                System.out.print("A nova lista: ");
                for (int num: vetor) {
                    System.out.print(num + " ");
                }
                System.out.print("\n");
            }
        }

        Arrays.sort(vetor);
        System.out.print("Colocar em ordem crescente: ");
        for (int num: vetor) {
            System.out.print(num + " ");
        }
    }
}
