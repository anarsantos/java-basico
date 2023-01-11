package com.company;

public class ContadorMudFlux {
    public static void main(String[] args) {

        int contadorCambalhota = 0;
        while (contadorCambalhota<10) {
            //Exemplo: continue
            contadorCambalhota++;
            if (contadorCambalhota == 2 || contadorCambalhota == 3 || contadorCambalhota == 4) {
                continue;
            }

            //Exemplo: break
            if (contadorCambalhota == 7) {
                break;
            }
            System.out.println("Cambalhota " + contadorCambalhota);
        }
    }
}
