package com.algaworks.rh;

public class Programador extends Funcionario {

    private double valorBonus;

    public Programador(String nome, double valorHora) {

        super(nome, valorHora);
    }

    public double getValorBonus() {

        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    protected double calcularSalario(int horasTrabalhadas) {
        double salarioProgramgador = super.calcularSalario(horasTrabalhadas) +  valorBonus;
        return salarioProgramgador;
    }

    @Override
    public String toString() {
        return "-- Programador --\n" +
                "nome = '" + getNome() + "\n" +
                "valorHora = " + getValorHora() + "\n" +
                "valorBonus=" + valorBonus + "\n";
    }
}
