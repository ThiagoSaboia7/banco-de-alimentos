package com.bancoalimentos.view;

import com.bancoalimentos.model.Lote;
import com.bancoalimentos.service.EstoqueService;
import java.time.LocalDate;

public class MenuTerminal {
    private EstoqueService estoqueService = new EstoqueService();

    public void executarFluxoSaida() {
        Lote loteValido = new Lote(1, 101, 201, 50.0, LocalDate.now().plusDays(30), 50.0);
        estoqueService.adicionarLote(loteValido);

        try {
            System.out.println("Tentando realizar saída de 20kg...");
            estoqueService.validarSaida(loteValido, 20.0);
            loteValido.descontarQuantidade(20.0);
            System.out.println("Saída realizada com sucesso! Novo saldo: " + loteValido.getQuantidade() + "kg");
        } catch (Exception e) {
            System.err.println("Erro na operação: " + e.getMessage());
        }
    }
}
