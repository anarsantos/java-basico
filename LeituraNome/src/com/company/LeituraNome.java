package com.company;

public class LeituraNome {
    public static void main(String[] args) {
        String s = "CURSOEMVIDEO";
        char [] r = new char[12];
        for (int c = s.length() - 1; c >=0; c--) {
            r[c] = s.charAt(c); // Essa linha vai exibir o caracter na posição 11, porque está contando de trás para frente.
        }
        for (char letra: r) {
            System.out.print(letra);
        }
    }
}
