package org.ewkekw.tecnologias.impl;

import org.ewkekw.tecnologias.IAparelhoTelefone;

public class AparelhoTelefone implements IAparelhoTelefone {
    private String numero;

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligado para " + numero + "...  ");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }
}
