package com.algaworks.rh;

public class Funcionario {

    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas) {
        double salario = horasTrabalhadas * getValorHora();
        return salario;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        double salario = calcularSalario(horasTrabalhadas);
        Holerite holerite = new Holerite(getNome(), mesAno, salario);
        return holerite;
    }

    @Override
    public String toString() {
        return "-- Funcionario --\n" +
                "nome = " + nome + "\n" +
                "valorHora = " + valorHora;
    }
}
