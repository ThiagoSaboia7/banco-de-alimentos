package com.bancoalimentos.model;

import java.time.LocalDateTime;

public abstract class MovimentoEstoque {
    protected int idMovimento;
    protected LocalDateTime dataHora;
    protected double quantidade;

    public MovimentoEstoque(int idMovimento, double quantidade) {
        this.idMovimento = idMovimento;
        this.quantidade = quantidade;
        this.dataHora = LocalDateTime.now();
    }

    // Método abstrato a ser implementado com polimorfismo
    public abstract void processarMovimentacao();

    public int getIdMovimento() {
        return idMovimento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public double getQuantidade() {
        return quantidade;
    }
}
