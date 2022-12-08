package com.algaworks.contaspagar.servico;

import com.algaworks.pagamento.*;

public class ServicoContasPagar {

    private MetodoDePagamento metodoDePagamento;

    public ServicoContasPagar(MetodoDePagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void pagar(DocumentoPagavel documento) {
        metodoDePagamento.pagar(documento);
    }
}
