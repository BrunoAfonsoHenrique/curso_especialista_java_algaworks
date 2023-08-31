package com.algaworks.model;

public class Holerite {

    private String nome;

    private String mesAno;

    private double valorSalario;


    public Holerite(String nome, String mesAno, double valorSalario) {
        this.nome = nome;
        this.mesAno = mesAno;
        this.valorSalario = valorSalario;
    }

    public void imprimir() {
        System.out.println();
        System.out.printf("Holerite de %s%n", nome);
        System.out.printf("Mês/ano: %s%n", mesAno);
        System.out.printf("Salário a receber: %.2f%n", valorSalario);
    }


}
