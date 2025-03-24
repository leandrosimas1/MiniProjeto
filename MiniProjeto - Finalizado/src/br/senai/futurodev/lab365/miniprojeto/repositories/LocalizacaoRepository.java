package br.senai.futurodev.lab365.miniprojeto.repositories;

import br.senai.futurodev.lab365.miniprojeto.models.Localizacao;

import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {
    private static final List<Localizacao> LOCALIZACOES = new ArrayList<>();

    public static void salvar(Localizacao novaLoc) {
        novaLoc.setId(LOCALIZACOES.size() + 1);
        LOCALIZACOES.add(novaLoc);
    }

    public Localizacao buscar(int id) {
        for (Localizacao localizacao : LOCALIZACOES) {
            if (id == localizacao.getId()) {
                return localizacao;
            }
        }
        return null;
    }
    public List<Localizacao> listaLocalizacoes(){
        if (this.LOCALIZACOES.isEmpty()){
            System.out.println("LISTA VAZIA!\n");
        }
        return this.LOCALIZACOES;
    }
}

