package com.company;

import java.util.Arrays;

public class VetorBusca {
    public static void main(String[] args) {
        int vetor[] = {3, 7, 6, 1, 9, 4, 2};

        for (int valor: vetor) {
            System.out.print(valor + " ");
        }

        System.out.println(" ");

        //Se não encontrar a posição, será exibido o valor negativo
        int posicao = Arrays.binarySearch(vetor, 1);
        System.out.println("Encontrei o valor na posição " + posicao);
    }
}
