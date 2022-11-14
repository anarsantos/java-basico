package com.company;

import java.util.Scanner;

public class ClasseMath {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float numerador;
        float denominador;

        System.out.print("Digite o numerador: ");
        numerador = teclado.nextFloat();
        System.out.print("Digite o denominador: ");
        denominador = teclado.nextFloat();

        float divisao = numerador/denominador;
        System.out.println("O resultado da divisão é " + divisao);
        float raiz = (float) Math.sqrt(numerador);
        System.out.println("A raiz quadrada é " + raiz);
    }
}
