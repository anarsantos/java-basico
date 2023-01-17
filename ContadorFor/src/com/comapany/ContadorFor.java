package com.comapany;

import javax.swing.*;
import java.util.Scanner;

public class ContadorFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroInicio, numeroFim, passo;
        System.out.print("Digite o valor de início (0-5): ");
        numeroInicio = teclado.nextInt();

        System.out.print("Digite o valor final (6-20): ");
        numeroFim = teclado.nextInt();

        System.out.print("Passo (1-4): ");
        passo = teclado.nextInt();

        DefaultListModel lista = new DefaultListModel<>();

        for (int contador=numeroInicio; contador<=numeroFim; contador += passo) {
            lista.addElement(contador);
        }
        System.out.println(lista);

    }
}
