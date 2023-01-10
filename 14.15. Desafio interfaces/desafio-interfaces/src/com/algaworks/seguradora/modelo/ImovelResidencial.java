package com.algaworks.seguradora.modelo;

public class ImovelResidencial implements BemSeguravel {

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        double premio = getValorMercado() * 0.01;
        premio += 0.3 * getAreaConstruida();
        return premio;
    }

    @Override
    public String descrever() {
        return String.format("O imovel residencial com %d metros quadrados de area construida " +
                "avaliado em R$%.2f", getAreaConstruida(), getValorMercado());
    }
}
