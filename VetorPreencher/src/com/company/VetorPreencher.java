package com.company;

import java.util.Arrays;

public class VetorPreencher {
    public static void main(String[] args) {
        int vetor[] = new int[20];
        Arrays.fill(vetor, 0);
        for (int valor: vetor) {
            System.out.print(valor + " ");
        }
    }
}
