package com.company;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /* Código com as variáveis dadas
        String nome = "Gustavo";
        float nota = 2.5f;
        //System.out.println("A nota é " + nota);
        //System.out.printf("A nota de %s é %.2f", nome, nota);
        System.out.format("A nota de %s é %.1f", nome, nota);
         */

        //Código com informação digitada pelo usuário
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f", nome, nota);
    }
}
