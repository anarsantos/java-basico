package com.company;

public class Contador01 {
    public static void main(String[] args) {
        int contadorCambalhota = 0;

        /*while (contadorCambalhota<4) {
            System.out.println("Cambalhota " + contadorCambalhota);
            contadorCambalhota++;
        }*/

        String contagem = " ";
        while (contadorCambalhota<=10) {
            contagem += contadorCambalhota + " ";
            contadorCambalhota++;
        }
        System.out.print("Contagem " + contagem);
    }
}
