package com.algaworks.rh;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.println("--- HOLERITE ---");
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Mês: " + mesAno);
        System.out.println("Valor do salário: " + valorSalario);
    }
}
