package com.company;

import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        System.out.print("Informe um valor: ");
        valor = teclado.nextInt();

        int restoDivisao = valor % 2;
        System.out.println("O resto da divisão é: " + restoDivisao);

        double cubo = Math.pow(valor, 3);
        System.out.println("Elevado ao cubo: " + cubo);

        double raizQuadrada = Math.sqrt(valor);
        System.out.println(String.format("Raiz quadrada: %.2f", raizQuadrada));

        double raizCubica = Math.cbrt(valor);
        System.out.println(String.format("Raiz cúbica : %.2f", raizCubica));

        int valorAbsoluto = Math.abs(valor);
        System.out.println("Valor absoluto: " + valorAbsoluto);
    }
}
