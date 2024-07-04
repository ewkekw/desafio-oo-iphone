package org.ewkekw.tecnologias.impl;

import org.ewkekw.tecnologias.INavegadorInternet;

import java.util.List;

public class NavegadorInternet implements INavegadorInternet {
    private List<String> historico;

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para  [ " + url + " ]");
        historico.add(url);
    }

    @Override
    public void exibirHistorico() {
        System.out.println("Historico de navegação:");
        for (String url : historico) {
            System.out.println(url);
        }
    }
}
