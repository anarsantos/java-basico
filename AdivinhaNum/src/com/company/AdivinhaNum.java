package com.company;

import java.util.Scanner;

public class AdivinhaNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valorDigitado;

        System.out.print("Digite um valor de 1 a 5: ");
        valorDigitado = teclado.nextInt();

        double geradorAleatorio = Math.random();
        //int numAleatorioInteiro =  1 + (int)(geradorAleatorio * ((6 - 1) + 1)); essa linha tem a mesma função da linha 16
        int numAleatorioInteiro = (int) (1 + geradorAleatorio * (6 - 1));

        String frase1 = "ACERTOU!";
        String frase2 = "ERROU! Eu pensei no valor " + numAleatorioInteiro + ".";

        String resultado = (numAleatorioInteiro == valorDigitado)?frase1:frase2;

        System.out.println(resultado);
    }
}
