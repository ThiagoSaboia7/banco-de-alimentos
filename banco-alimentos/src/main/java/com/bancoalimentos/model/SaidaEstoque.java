package com.bancoalimentos.model;

public class SaidaEstoque extends MovimentoEstoque {
    private Lote lote;
    private String motivo;

    // Sobrecarga de construtor (sem motivo pré-definido)
    public SaidaEstoque(int idMovimento, double quantidade, Lote lote) {
        super(idMovimento, quantidade);
        this.lote = lote;
        this.motivo = "Distribuição Regular";
    }

    // Sobrecarga de construtor (com motivo específico)
    public SaidaEstoque(int idMovimento, double quantidade, Lote lote, String motivo) {
        super(idMovimento, quantidade);
        this.lote = lote;
        this.motivo = motivo;
    }

    @Override
    public void processarMovimentacao() {
        lote.descontarQuantidade(this.quantidade);
    }

    public Lote getLote() {
        return lote;
    }

    public String getMotivo() {
        return motivo;
    }
}
