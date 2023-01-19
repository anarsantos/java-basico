package com.company;

import java.util.Scanner;

public class Fatorial01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        System.out.print("Digite um valor: ");
        numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Não aceitamos números negativo.");
        } else {
            int fatorial = 1;
            int contador = numero;

            //Extra
            String s = "";

            while (contador>=1) {
                fatorial = fatorial * contador;
                if (contador >1) {
                    s = s + contador + " x ";
                } else {
                    s += contador;
                }
                contador = contador - 1;
            }
            System.out.println("O fatorial de " + numero + "! é " + s + " = " + fatorial);
        }
    }
}
