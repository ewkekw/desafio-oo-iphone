package org.ewkekw.tecnologias.impl;

import org.ewkekw.tecnologias.IReprodutorMusical;

import java.util.List;

public class ReprodutorMusical implements IReprodutorMusical {
    private List<String> musicas;

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada!");
    }

    @Override
    public void adicionarMusica(String musica) {
        musicas.add(musica);
        System.out.println("Música: " + musica + " adicionada!");
        System.out.println("Sua lista de músicas atuais: ");
        for (String musicas : musicas) {
            System.out.println(musicas);
        }
    }
}
