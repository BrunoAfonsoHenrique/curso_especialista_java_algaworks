package com.algaworks.pagamento;

public interface DocumentoPagavel {

    public abstract double pegarValorTotal();

    // de forma implicita o método é public e abstract
    Beneficiario pegarBeneficiario();
}
