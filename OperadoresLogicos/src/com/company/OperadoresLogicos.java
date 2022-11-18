package com.company;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operador lógico &&
        /*int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado; //variável lógica
        resultado = (x<y && y==z)?true:false;
        System.out.println(resultado);*/

        //Operador lógico || (ou)
        /*int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado; //variável lógica
        resultado = (x<y || y==z)?true:false;
        System.out.println(resultado);*/

        //Operador lógico ^ (ou exclusivo)
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado; //variável lógica
        resultado = (x<y ^ y<z)?true:false;
        System.out.println(resultado);
    }
}
