package com.algaworks.contaspagar.modelo;

import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.DocumentoPagavel;

public class OrdemServico implements DocumentoPagavel {

    private Beneficiario forecedor;
    private double valorTotal;

    public OrdemServico(Beneficiario forecedor, double valorTotal) {
        this.forecedor = forecedor;
        this.valorTotal = valorTotal;
    }

    public Beneficiario getForecedor() {
        return forecedor;
    }

    public void setForecedor(Beneficiario forecedor) {
        this.forecedor = forecedor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public double pegarValorTotal() {
        return 0;
    }

    @Override
    public Beneficiario pegarBeneficiario() {
        return getForecedor();
    }
}
