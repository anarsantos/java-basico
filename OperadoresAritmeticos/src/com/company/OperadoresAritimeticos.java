package com.company;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        // Média de dois números - resultado 4.
        /*int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2;
        System.out.println("A média é igual a " + media);*/

        //Incremento - o 5 passa a ser 6
        /*int numero = 5;
        numero++; // numero = numero + 1;
        System.out.println(numero);*/

        /*int i = 10;
        System.out.println(i++);
        System.out.println(i);*/

        //Decremento - o 5 passa a ser 4
        /*int numero = 5;
        numero--;
        System.out.println(numero);*/

        //Pós incremento - ++ depois, faça todas as operações e no final soma mais 1 no número. O valor = 10 e numero = 6
        /*int numero = 5;
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);*/

        //Pós decremento - ++ depois, faça todas as operações e no final soma mais 1 no número. O valor = 14 e numero = 9
        /*int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);*/

        //Pré incremento - o cálculo é relizado antes. O resultado será 11.
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);

        // Operadores de atribuição - o resultado é 6.
        /*int x = 4;
        x += 2; // x = x + 2;
        System.out.println(x);*/

        //Arredonda para baixo - resultado 8
        /*float valor = 8.9f;
        int arredonda = (int) Math.floor(valor);
        System.out.println(arredonda);*/

        //Arredonda para cima - resultado 9
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
        /*double aleatorio = Math.random();
        int numero = (int) (5 + aleatorio * (10 - 5));
        System.out.println(numero);*/

        // O resultado é 5.
        /*int n = 4;
        System.out.println("O valor da variável é " + ++n);*/

        // Exercício 1 - O valor de n = 4 e resultado = 5.
        /*int n = 4;
        System.out.println("O valor da variável n é " + n++);
        int resultado = n;
        System.out.println("O valor da variável resultado é " + resultado);*/

        // Exercício 2 - O resultado da divisão do número inteiro é 2.5, mas como o tipo da variável resultado está em double ficará 2.0.
        /*int n1 = 2;
        int n2 = 5;
        double resultado = n2/n1;
        System.out.println(resultado);*/

        // Exercício 3 - O resultado é 7 1 3.
        /*int v1 = 7;
        int v2 = v1 % 2;
        int v3 = 2;
        v3 += v2;
        System.out.println(v1 + " " + v2 + " " + v3);*/
    }
}
