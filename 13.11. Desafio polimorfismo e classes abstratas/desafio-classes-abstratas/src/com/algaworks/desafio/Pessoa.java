package com.algaworks.desafio;

public abstract class Pessoa {

    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularImpostos();
}
