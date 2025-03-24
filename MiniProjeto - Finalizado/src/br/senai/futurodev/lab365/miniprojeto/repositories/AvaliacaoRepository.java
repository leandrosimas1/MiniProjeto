package br.senai.futurodev.lab365.miniprojeto.repositories;

import br.senai.futurodev.lab365.miniprojeto.models.Avaliacao;

import java.util.ArrayList;
import java.util.List;

public class AvaliacaoRepository {
    private static final List<Avaliacao> AVALIACOES = new ArrayList<>();

    public static void salvar(Avaliacao novaAvaliacao) {
        novaAvaliacao.setIdentificadorAreaVerde(AVALIACOES.size() + 1);
        AVALIACOES.add(novaAvaliacao);
    }

    public Avaliacao buscar(int id) {
        for (Avaliacao avaliacao : AVALIACOES) {
            if (id == avaliacao.getId()) {
                return avaliacao;
            }
        }
        return null;
    }

    public List<Avaliacao> listaAvaliacoes(){
        if (this.AVALIACOES.isEmpty()){
            System.out.println("LISTA VAZIA!\n");
        }
        return this.AVALIACOES;
    }
}
