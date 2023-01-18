package com.algaworks.locadora;

public class SeguroItau implements Seguro {

    @Override
    public double calcularValorSeguro(int horasUtilizadas, double valorContrato) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return dias * 5;
    }
}
