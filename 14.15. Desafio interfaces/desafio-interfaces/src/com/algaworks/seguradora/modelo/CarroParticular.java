package com.algaworks.seguradora.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio(){
        double premio = getValorMercado() * 0.04;
        if(getAnoFabricacao() < 2000) {
            premio *= 1.05;
        }
        return premio;
    }

    @Override
    public String descrever() {
        return String.format("O Carro particular fabricado no ano %d, cujo o modelo é %s, " +
                "tem o valor de mercado de R$%.2f", getAnoFabricacao(), getModelo(), getValorMercado());


    }
}
