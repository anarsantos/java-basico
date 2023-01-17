package com.company;

public class RepeticaoFor {
    public static void main(String[] args) {
        /*for (int contadorCambalhota = 0; contadorCambalhota <= 3; contadorCambalhota++) { //ou contadorCambalhota> 4
            System.out.println(contadorCambalhota);
        }*/

        /*
        int contadorCambalhota = 0;
        while (contadorCambalhota < 4) {
            System.out.println("Cambalhota");
        }
         */

        //Pulando 10
        for (int contadorCambalhota = 0; contadorCambalhota <= 100; contadorCambalhota += 10) {
            System.out.println(contadorCambalhota);
        }
    }
}
