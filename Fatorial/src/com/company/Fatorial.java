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
        String s = "";

        while (contador>=1) {
            fatorial *= contador;
            if (contador >1) {
                s += contador + " x ";
            } else {
                s += contador;
            }
            contador--;
        }
        if (contador==0) {
            System.out.println("O fatorial de 0 é 0.");
        }else {
            System.out.println("O fatorial de " + numero + "! é " + s + " = " + Integer.toString(fatorial));
        }

        //System.out.println("O fatorial de " + numero + "! é igual a " + fatorial);
    }
}
