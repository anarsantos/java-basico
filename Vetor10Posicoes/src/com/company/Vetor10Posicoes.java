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

        //Verificar repetição
        /*for (int i = 0; i <10; i++) {
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
                if (vetor[i] == -1) {
                    vetor[i] = numeroAleatorio;
                }
            }
        }

        for (int contador = 0; contador < 10; contador++) {
            System.out.print(vetor[contador] + " ");
        }*/
    }
}
