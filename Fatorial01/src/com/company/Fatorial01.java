package com.company;

import java.util.Scanner;

public class Fatorial01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        System.out.print("Digite um valor: ");
        numero = teclado.nextInt();

        int fatorial = 1;
        int contador = numero;

        //Extra
        String s = "";

        while (contador>=1) {
            fatorial *= contador;
            s += contador + " x ";
            contador--;
        }
        System.out.println("O fatorial de " + numero + "! é " + s + " = " + fatorial);
    }
}
