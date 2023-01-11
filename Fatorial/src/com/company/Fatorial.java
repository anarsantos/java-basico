package com.company;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        System.out.print("Digite o número para calcular o fatorial: ");
        numero = teclado.nextInt();

        int fatorial = 1;
        int contador = numero;

        while (contador>=1) {
            fatorial *= contador;
            contador--;
        }

        System.out.println("O fatorial é " + fatorial);
    }
}
