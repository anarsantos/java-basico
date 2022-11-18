package com.company;

public class ComparacaoString {
    public static void main(String[] args) {
        /*String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String resultado;
        resultado = (nome1==nome3)?"igual":"diferente";
        System.out.println(resultado);*/

        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String resultado;
        // .equals é um método que verifica se o conteúdo de um objeto é igual ao conteúdo do outro.
        // O que será verificado é se o que está dentro de nome1 é a mesma coisa do que está dentro de nome3
        resultado = (nome1.equals(nome2))?"igual":"diferente";
        System.out.println(resultado);
    }
}
