package com.company;

import java.util.Random;

/*Programa: preencher um vetor de 10 posições com números aleatórios de 0 a 9.
Os números não podem se repetir. Peça para mostrar a posição do valor 5.
 */

public class Vetor10Posições2 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int numero = 0;

        //Objeto random para gerar números aleatórios
        Random random = new Random();

        //10 números inteiros aleatórios
        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(10);
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");

        //Verificar repetição
        for (int i = 0; i <10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (vetor[i] == vetor[j]) {
                    vetor[j] = -1;
                }
            }
        }
        //Exibe o -1 no lugar dos números repetidos
        for (int contador = 0; contador < 10; contador++) {
            System.out.print(vetor[contador] + " ");
        }
        System.out.println("\n");

        //Substituir o número repetido
        for (int i = 0; i <10; i++) {
            int numeroAleatorio = random.nextInt(10);
            int numeroUnico = -1;
            for (int j = i + 1; j < 10; j++) {
                if (vetor[j] == numeroAleatorio) {
                    numeroAleatorio = random.nextInt(10);
                    break;
                } else {
                    numeroUnico = numeroAleatorio;

                }
            }
            for (int j = i + 1; j < 10; j++) {
                if (vetor[j] == -1) {
                    vetor[i] = numeroAleatorio;
                }
            }
        }

        for (int contador = 0; contador < 10; contador++) {
            System.out.print(vetor[contador] + " ");
        }
    }
}
