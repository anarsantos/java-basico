package com.company;

import java.awt.*;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        double largura = resolucao.getWidth();
        double altura = resolucao.getHeight();
        System.out.print("A resolução da tela é " + largura + " x " + altura);
    }
}
