package com.bancoalimentos.service;

import com.bancoalimentos.model.Doador;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DoadorService {
    private List<Doador> doadores = new ArrayList<>();

    // Create
    public void cadastrar(Doador doador) {
        doadores.add(doador);
    }

    // Read
    public List<Doador> listarTodos() {
        return new ArrayList<>(doadores);
    }

    // Update
    public void atualizar(int id, String novoNome, String novoEndereco) {
        Optional<Doador> doadorOpt = doadores.stream()
                .filter(d -> d.getIdDoador() == id)
                .findFirst();
        if (doadorOpt.isPresent()) {
            Doador d = doadorOpt.get();
            d.setNomeRazaoSocial(novoNome);
            d.setEndereco(novoEndereco);
        }
    }

    // Delete (Inativação Lógica para Preservação de Histórico)
    public void inativar(int id) {
        Optional<Doador> doadorOpt = doadores.stream()
                .filter(d -> d.getIdDoador() == id)
                .findFirst();
        doadorOpt.ifPresent(d -> d.setStatus("INATIVO"));
    }
}
