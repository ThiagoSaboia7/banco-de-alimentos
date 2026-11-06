package com.bancoalimentos.model;

import java.time.LocalDate;

public class Lote {
    private int idLote;
    private int idDoacao;
    private int idItem;
    private double quantidade;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;
    private String condicao;
    private double pesoKg;

    public Lote(int idLote, int idDoacao, int idItem, double quantidade, LocalDate dataValidade, double pesoKg) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade inicial do lote deve ser maior que zero.");
        }
        this.idLote = idLote;
        this.idDoacao = idDoacao;
        this.idItem = idItem;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.pesoKg = pesoKg;
    }

    public boolean estaVencido() {
        if (dataValidade == null) {
            return false;
        }
        return LocalDate.now().isAfter(dataValidade);
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void descontarQuantidade(double qtd) {
        this.quantidade -= qtd;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public int getIdLote() {
        return idLote;
    }

    public int getIdDoacao() {
        return idDoacao;
    }

    public int getIdItem() {
        return idItem;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }
}
