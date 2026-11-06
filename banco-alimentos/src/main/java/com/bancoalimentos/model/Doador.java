package com.bancoalimentos.model;

import java.time.LocalDate;

public class Doador {
    private int idDoador;
    private String nomeRazaoSocial;
    private String tipoDoador;
    private String cnpjCpf;
    private String email;
    private String telefone;
    private String endereco;
    private LocalDate dataCadastro;
    private String status;

    public Doador(int idDoador, String nomeRazaoSocial, String tipoDoador, String cnpjCpf, String endereco) {
        this.idDoador = idDoador;
        this.nomeRazaoSocial = nomeRazaoSocial;
        this.tipoDoador = tipoDoador;
        this.cnpjCpf = cnpjCpf;
        this.endereco = endereco;
        this.dataCadastro = LocalDate.now();
        this.status = "ATIVO";
    }

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }

    public String getTipoDoador() {
        return tipoDoador;
    }

    public void setTipoDoador(String tipoDoador) {
        this.tipoDoador = tipoDoador;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
