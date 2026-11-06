package com.bancoalimentos.service;

import com.bancoalimentos.model.Lote;
import com.bancoalimentos.exception.EstoqueInsuficienteException;
import com.bancoalimentos.exception.LoteVencidoException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstoqueService {
    private List<Lote> lotesEmEstoque = new ArrayList<>();

    public void adicionarLote(Lote lote) {
        lotesEmEstoque.add(lote);
    }

    // Consulta e filtragem com Java Streams e Collections
    public List<Lote> listarLotesProximosVencimento() {
        return lotesEmEstoque.stream()
                .filter(Lote::estaVencido)
                .collect(Collectors.toList());
    }

    public void validarSaida(Lote lote, double quantidadeSolicitada)
            throws LoteVencidoException, EstoqueInsuficienteException {
        if (lote.estaVencido()) {
            throw new LoteVencidoException("Operação Cancelada: O lote selecionado está vencido.");
        }
        if (quantidadeSolicitada > lote.getQuantidade()) {
            throw new EstoqueInsuficienteException("Operação Cancelada: Saldo insuficiente no estoque.");
        }
    }

    public List<Lote> getLotesEmEstoque() {
        return new ArrayList<>(lotesEmEstoque);
    }
}
