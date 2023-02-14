package com.company;

/*Programa: preencher um vetor de 10 posições com números aleatórios de 0 a 9.
Os números não podem se repetir. Peça para mostrar a posição do valor 5.
 */

import java.util.Random;

public class Vetor10Posicoes {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int numero = 0;
        int novoNumero = 0;

        //Objeto random para gerar números aleatórios
        Random random = new Random();

        //10 números inteiros aleatórios
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                vetor[i] = random.nextInt(10);
            } else {
                for (int j = 0; j < i; j++) {
                   if (vetor[j] == numero) {
                        numero = random.nextInt(10);
                        j = -1;
                   }
                }
                vetor[i] = numero;
            }
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");

        //A posição do valor 5:
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == 5) {
                System.out.println("O valor 5 encontra-se na posicao: " + i);
            }
        }
    }
}

