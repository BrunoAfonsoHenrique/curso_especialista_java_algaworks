package com.algaworks.desafio;

public class PessoaFisica extends Pessoa{

    public static final double RECEITA_ANUAL_ISENCAO = 50_000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        double imposto = 0.0;
        if (verificaIsencaoImposto()) {
            return imposto;
        }
        imposto = receitaAnual * ALIQUOTA_IMPOSTO_RENDA;
        return imposto;
    }

    private boolean verificaIsencaoImposto() {
        return receitaAnual <= RECEITA_ANUAL_ISENCAO;
    }
}
