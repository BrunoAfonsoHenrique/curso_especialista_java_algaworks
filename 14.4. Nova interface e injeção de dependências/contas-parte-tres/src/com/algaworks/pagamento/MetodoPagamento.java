package com.algaworks.pagamento;

public interface MetodoPagamento {

    public abstract void pagar(DocumentoPagavel documento);
}
