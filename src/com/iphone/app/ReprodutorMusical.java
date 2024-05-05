package com.iphone.app;

public interface ReprodutorMusical {
    static void tocarMusica(int idMusica) {
        System.out.println("Tocando música...");
    }

    static void pausar() {
        System.out.println("Pausa...");
    }

    static void selecionarMusica() {
        System.out.println("Selecione a música...");
    }
}
