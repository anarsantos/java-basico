package com.company;

import javax.swing.*;

public class ExercicioRepita {
    public static void main(String[] args) {
        int numero, soma = 0, totalValores = -1, par = -1, impar = 0, valorMaiorCem = 0;
        float media = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(O valor 0 interrompe)<em></html>"));
            //Soma os números digitados
            soma += numero;

            //Mostra a quantidade de números digitados
            totalValores++;

            //Mostra valores pares e ímpares
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            //Mostra valores acima de 100
            if (numero >= 100) {
                valorMaiorCem++;
            }
        } while (numero != 0);

        //Mostra a média dos valores, pega a soma de todos os valores divide por todos os números digitados
        media = soma / totalValores;

        JOptionPane.showMessageDialog(null,
                "<html>Resultado final <br><hr>" + "<br>Total de valores digitados: " + totalValores +
                        "<br>Total de pares: " + par + "<br>Total de ímpares: " + impar +
                        "<br>Valor acima de 100: " + valorMaiorCem +
                        "<br>Média dos valores: " + media + "</html>");
    }
}
