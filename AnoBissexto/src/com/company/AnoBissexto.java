package com.company;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("O ano é bissexto? ");
        int ano = teclado.nextInt();

        //São bissextos todos os anos múltiplos de 400, os múltiplos de 4, e não múltiplos de 100.
        /*if ((ano % 400 ==0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Ano bissexto.");
        } else {
            System.out.println("Esse ano não é bissexto.");
        }*/

        //Com variável boleana
        boolean x = (ano % 400 ==0) || (ano % 4 == 0 && ano % 100 != 0);
        System.out.println(x);

    }
}
