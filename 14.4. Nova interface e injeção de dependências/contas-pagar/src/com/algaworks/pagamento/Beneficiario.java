package com.algaworks.pagamento;

public class Beneficiario {

    private String nome;
    private String chavePix;
    private String contaBancaria;

    public Beneficiario(String nome, String chavePix, String contaBancaria) {
        this.nome = nome;
        this.chavePix = chavePix;
        this.contaBancaria = contaBancaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public boolean naoPossuiChavePix() {
        boolean pix = getChavePix() == null || getChavePix().isEmpty();
        return pix;
    }

    public boolean naoPossuiContaBancaria() {
        boolean contaBancaria = getContaBancaria() == null || getContaBancaria().isEmpty();
        return contaBancaria;
    }
}
