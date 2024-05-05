package com.iphone.phone;

public abstract class AparelhoCelular {
    protected void ligarAparelho() {
        System.out.println("Ligando Aparelho...");
        System.out.println("Aparelho Ligado.");
    }
    protected void desligarAparelho() {
        System.out.println("Desligando Aparelho...");
        System.out.println("Aparelho Desligado.");
    }

    protected void ativarModoSilencioso() {
        System.out.println("Modo silêncioso ativado.");
    }

    protected void desativarModoSilencioso() {
        System.out.println("Modo silêncioso desativado.");
    }

    protected void aumentarVolume() {
        System.out.println("Aumentando volume...");
    }

    protected void diminuirVolume() {
        System.out.println("Diminuindo colume...");
    }
}
