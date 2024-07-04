package org.ewkekw;

import org.ewkekw.tecnologias.IAparelhoTelefone;
import org.ewkekw.tecnologias.INavegadorInternet;
import org.ewkekw.tecnologias.IReprodutorMusical;
import org.ewkekw.tecnologias.impl.AparelhoTelefone;
import org.ewkekw.tecnologias.impl.NavegadorInternet;
import org.ewkekw.tecnologias.impl.ReprodutorMusical;

public class Iphone{
    private IAparelhoTelefone telefone;
    private INavegadorInternet navegador;
    private IReprodutorMusical musicas;

    public void iPhone() {
        this.musicas = new ReprodutorMusical();
        this.telefone = new AparelhoTelefone();
        this.navegador = new NavegadorInternet();
    }

    //Celular
    public void ligar() {
        System.out.println("Ligando Iphone...");
    }

    public void desligar() {
        System.out.println("Desligando Iphone...");
    }

    //Músicas
    public void tocarMusica(){
        tocarMusica();
    }

    public void pausarMusica(){
        musicas.pausarMusica();
    }

    public void adicionarMusica(String musica){
        musicas.adicionarMusica(musica);
    }

    //Navegador
    public void navegar(String url){
        navegador.navegar(url);
    }

    public void exibirHistorico(){
        navegador.exibirHistorico();
    }

    //Telefone
    public void fazerChamada(String numero){
        telefone.fazerChamada(numero);
    }

    public void encerrarChamada() {
        telefone.encerrarChamada();
    }
}
