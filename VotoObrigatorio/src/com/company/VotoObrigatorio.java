package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VotoObrigatorio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String ano = "yyyy";
        int nascimento;

        SimpleDateFormat formatacaoAno = new SimpleDateFormat(ano);
        String dataDoSistema = formatacaoAno.format(new Date());

        System.out.print("Qual o ano de nascimento: ");
        nascimento = teclado.nextInt();

        int idade = Integer.parseInt(dataDoSistema) - nascimento;
        System.out.println("Sua idade: " + idade);

        /*if (idade < 16) {
            System.out.print("Não vota!");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.print("Opcional");
            } else {
                System.out.print("Voto obrigatório!");
            }
        }*/

        if (idade < 16) {
            System.out.print("Não vota!");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.print("Opcional");
        } else {
                System.out.print("Voto obrigatório!");
        }
    }
}
