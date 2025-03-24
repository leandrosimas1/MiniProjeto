package br.senai.futurodev.lab365.miniprojeto.repositories;

import br.senai.futurodev.lab365.miniprojeto.models.AreaVerde;
import br.senai.futurodev.lab365.miniprojeto.models.Avaliacao;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

public class AreaVerdeRepository {
    private static final List<AreaVerde> AREA_VERDE = new ArrayList<>();

    public static void salvar(AreaVerde novaAreaVerde) {
        novaAreaVerde.setId(AREA_VERDE.size() + 1);
        AREA_VERDE.add(novaAreaVerde);
    }

    public static AreaVerde buscar(int id) {
        for (AreaVerde areaVerde : AREA_VERDE) {
            if (id == areaVerde.getId()) {
                return areaVerde;
            }
        }
        return null;
    }
    public static List<AreaVerde> listarAreaVerde(){
        if (AREA_VERDE.isEmpty()){
            System.out.println("Lista vazia.\n");
        }
        return AREA_VERDE;
    }
}