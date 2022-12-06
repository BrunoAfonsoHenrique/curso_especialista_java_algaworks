package com.algaworks.pagamento;

public interface DocumentoPagavel {

    public abstract double pegarValorTotal();

    public abstract Beneficiario pegarBeneficiario();

}
