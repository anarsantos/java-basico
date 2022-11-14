package com.company;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        // Média de dois números
        /*int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2;
        System.out.println("A média é igual a " + media);*/

        //Incremento
        /*int numero = 5;
        numero--;
        System.out.println(numero);*/

        //Pós incremento - ++ depois faça todas as operações e no final soma mais 1 no número.
        /*int numero = 5;
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);*/

        //Pré incremento - o cálculo é relizado antes.
        /*int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);*/

        // Operadores de atribuição
        /*int x = 4;
        x += 2; // x = x + 2;
        System.out.println(x);*/

        //Arredonda para baixo
        /*float valor = 8.9f;
        int arredonda = (int) Math.floor(valor);
        System.out.println(arredonda);*/

        //Arredonda para cima
        /*float valor = 8.9f;
        int arredonda = (int) Math.ceil(valor);
        System.out.println(arredonda);*/

        // 8.4 arredonda para baixo = 8, 8.5 arredonda para cima = 9
        /*float valor = 8.4f;
        int arredonda = (int) Math.round(valor);
        System.out.println(arredonda);*/

        // Número aleatório
        /*double aleatorio = Math.random();
        System.out.println(aleatorio);*/

        // Número aleatório entre 5 e 10
        double aleatorio = Math.random();
        int numero = (int) (5 + aleatorio * (10 - 5));
        System.out.println(numero);
    }
}
