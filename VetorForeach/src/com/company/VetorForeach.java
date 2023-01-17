package com.company;

import java.util.Arrays;

public class VetorForeach {
    public static void main(String[] args) {
        double vetor[] = {3.5, 2.75, 9, -4.5};

        //A função do sort é para ordenar o vetor
        Arrays.sort(vetor);

        for (double valor: vetor) {
            System.out.print(valor + " ");
        }
    }
}
