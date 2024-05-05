package com.iphone.phone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone myIphone = new Iphone();

        //Metodos comuns aos aparelhos celulares
        myIphone.ativarModoSilencioso();
        myIphone.desativarModoSilencioso();
        myIphone.aumentarVolume();

        //metodos disponíveis somente no iphone
        myIphone.conectarItunes();

        //metodos telefone
        myIphone.atender();
        myIphone.ligar("(32)98899-5578");
        myIphone.iniciarCorreioVoz();

        //metodos do reprodutor musical
        myIphone.selecionarMusica();
        myIphone.tocarMusica(85);
        myIphone.pausar();

        //metodos navegador web
        myIphone.adicionarAba();
        myIphone.atualizarPagina();
        myIphone.exibirPagina();
    }
}
