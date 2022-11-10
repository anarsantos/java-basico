package com.company;

import java.util.Date;

public class DataAtual {
    public static void main(String[] args) {
        // Mostrar data e hora atuais do sistema
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
    }
}
