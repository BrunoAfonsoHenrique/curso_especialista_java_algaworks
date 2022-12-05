package com.algaworks.desafio;

public class EmpresaSimples extends PessoaJuridica {

    public static final double ALIQUOTA_IMPOSTO_FATURAMENTO = 0.06;

    public EmpresaSimples(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        double imposto = getFaturamentoAnual() * ALIQUOTA_IMPOSTO_FATURAMENTO;
        return imposto;
    }
}
