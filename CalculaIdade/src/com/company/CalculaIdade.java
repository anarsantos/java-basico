package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /* O usuário digita as datas
        //variáveis
        int anoAtual;
        int anoNascimento;
        int idade;

        System.out.print("Digite o ano atual: ");
        anoAtual = teclado.nextInt();
        System.out.print("Digite o ano do seu nascimento: ");
        anoNascimento = teclado.nextInt();
        idade = anoAtual - anoNascimento;
        System.out.print("Você tem " + idade + " anos.");*/

        // O usuário digita apenas a data de nascimento, o ano atual o sistema informa
        String ano = "yyyy";
        int anoNascimento;
        int idade;

        SimpleDateFormat formatacaoAno = new SimpleDateFormat(ano);
        String date = formatacaoAno.format(new Date());
        System.out.println("Ano atual " + date + ".");

        System.out.print("Digite o ano do seu nascimento: ");
        anoNascimento = teclado.nextInt();

        idade = Integer.parseInt(date) - anoNascimento;
        System.out.println("Você tem " + idade + " anos.");
    }
}
