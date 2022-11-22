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

        /*Operador lógico ^ (ou exclusivo), retorna true apenas se ambos os valores booleanos forem diferentes;
         caso contrário, retorna false. O resultado abaixo retorna false, porque os dois resultados são true.*/
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado; //variável lógica
        resultado = (x<y ^ y<z)?true:false;
        System.out.println(resultado);
    }
}
