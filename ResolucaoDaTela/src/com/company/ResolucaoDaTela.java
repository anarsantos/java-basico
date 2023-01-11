package com.company;

import java.awt.*;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();

        Double largura = resolucao.getWidth();
        Integer larguraInt = largura.intValue();
        Double altura = resolucao.getHeight();
        Integer alturaInt = altura.intValue();
        System.out.print("A resolução da tela é " + larguraInt + " x " + alturaInt);
    }
}
