package com.company;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual sua data de nascimento? ");
        int dataNascimento = teclado.nextInt();
        int idade = 2022 - dataNascimento;
        System.out.println("Sua idade é " + idade);
        if (idade>=18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
    }
}
