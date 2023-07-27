package com.algaworks.agencia;

import java.util.Objects;

public class Hotel implements Comparable<Hotel>{

    private String nome;
    private String cidade;
    private Double precoDiaria;

    public Hotel(String nome, String cidade, double precoDiaria) {
        this.nome = nome;
        this.cidade = cidade;
        this.precoDiaria = precoDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(Double precoDiaria) {
        if (precoDiaria < 0) {
            throw new IllegalArgumentException("Preço da diária não pode ser negativo");
        }

        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", precoDiaria=" + precoDiaria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return nome.equals(hotel.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(Hotel hotel) {
        return getNome().compareTo(hotel.getNome());
//        return Double.valueOf(getPrecoDiaria())
//                .compareTo(Double.valueOf(hotel.getPrecoDiaria()));
    }
}
