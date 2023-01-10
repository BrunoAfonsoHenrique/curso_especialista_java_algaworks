package com.algaworks.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor {

    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }


    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double premio = getValorMercado() * 0.02;
        premio += 50 * quantidadeEixos;
        return premio;
    }

    @Override
    public String descrever() {
        return String.format("O caminhao tem %d eixos e valor de mercado " +
                "de R$%.2f", getQuantidadeEixos(), getValorMercado());
    }
}
