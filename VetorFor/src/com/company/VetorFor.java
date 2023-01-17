package com.company;

public class VetorFor {
    public static void main(String[] args) {
        //O vetor é um objeto e tem características e métodos uma propriedade é o tamanho
        int numero[] = {3,2,8,7,5,4};

        //length é um atributo do vetor
        /*System.out.println("Total de casas de numero " + numero.length);

        for (int contador=0; contador<=5; contador++) {
            System.out.println("Na posição " + contador + " temos o valor " + numero[contador]);
        }*/

        for (int contador=0; contador<=numero.length-1; contador++) {
            System.out.println("Na posição " + contador + " temos o valor " + numero[contador]);
        }

    }
}
