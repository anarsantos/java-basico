package com.company;

public class ExercicioTernario {
    public static void main(String[] args) {
        int a = 5, b = 2;
        String c;
        //c = (a<=b)?"Segundo é maior":"Primeiro é maior.";
        c = (a>=b)?"Primeiro é maior":"Segundo é maior.";
        System.out.println(c);
    }
}
