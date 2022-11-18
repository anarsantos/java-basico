package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String padraoDataAno = "yyyy";
        int anoNascimento;
        int idade;

        SimpleDateFormat formatacaoAno = new SimpleDateFormat(padraoDataAno);
        String dataDoSistema = formatacaoAno.format(new Date());

        System.out.print("Digite o ano do seu nascimento: ");
        anoNascimento = teclado.nextInt();

        idade = Integer.parseInt(dataDoSistema) - anoNascimento;
        System.out.println("Sua idade: " + idade);

        String situacao = ((idade>=16 && idade<18) || (idade>70))?"O VOTO É OPCIONAL.":"O VOTO NÃO É OPCIONAL.";
        System.out.print("Situação: " + situacao);
    }
}
