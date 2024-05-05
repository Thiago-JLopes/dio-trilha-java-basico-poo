package com.iphone.phone;

import com.iphone.app.NavegadorWeb;
import com.iphone.app.ReprodutorMusical;
import com.iphone.app.Telefone;

public class Iphone extends AparelhoCelular implements NavegadorWeb, Telefone, ReprodutorMusical {

    public void conectarItunes() {
        System.out.println("Itunes conectado.");
    }

    //Implementa métodos do navegador web
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    //Implementa métodos do Telefone

    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para o número " + numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    //Implementa métoddos do reprodutor musical

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    @Override
    public void tocarMusica(int idMusica) {
        System.out.println("tocando a música....");
    }

    @Override
    public void pausar() {
        System.out.println("Em pausa...");
    }
}
