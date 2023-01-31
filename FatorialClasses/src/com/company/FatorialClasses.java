package com.company;

public class FatorialClasses {
    //Atributos
    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";

    //Método que calcula o fatorial
    public void setValor(int n) {
        numero = n;
        int f = 1;
        String s = "";
        for (int contador = n; contador > 1; contador--) {
            f *= contador;
            s += contador + " x ";
        }
        s += "1 = ";
        fatorial = f;
        formula = s;
    }

    public int getFatorial() {
        return fatorial;
    }

    public String getFormula() {
        return formula;
    }
}
