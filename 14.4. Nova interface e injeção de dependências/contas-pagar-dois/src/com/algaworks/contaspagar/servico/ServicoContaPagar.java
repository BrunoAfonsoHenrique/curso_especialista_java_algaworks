package com.algaworks.contaspagar.servico;

import com.algaworks.pagamento.*;

public class ServicoContaPagar {

    //Iversao de controle
    private MetodoDePagamento metodoDePagamento;

    public ServicoContaPagar(MetodoDePagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void pagar(DocumentoPagavel documento) {

        //MetodoDePagamento metodoDePagamento = new Tranferencia();
        metodoDePagamento.pagar(documento);

        //Poderia ter outras regras de neócios aqui

    }
}