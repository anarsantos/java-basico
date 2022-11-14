package com.company;

import java.util.Scanner;

public class DivisaoResto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float numerador;
        float denomidador;

        System.out.print("Digite o numerador: ");
        numerador = teclado.nextFloat();
        System.out.print("Digite o denominador: ");
        denomidador = teclado.nextFloat();

        float divisao = numerador/denomidador;
        System.out.println("O resultado da divisão é " + divisao);
        float restoDaDivisao = numerador%denomidador;
        System.out.println("O resto da divisão é " + restoDaDivisao);
    }
}
