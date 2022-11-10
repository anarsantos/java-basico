package com.company;

import java.util.Scanner;

public class SomaDoisNum {
    public static void main(String[] args) {
        //variáveis
        Scanner teclado = new Scanner(System.in);
        int n1;
        int n2;
        int soma;

        System.out.print("Digite o primeiro número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = teclado.nextInt();
        soma = n1 + n2;
        System.out.print("A soma dos dois números eh " + soma);
    }
}
