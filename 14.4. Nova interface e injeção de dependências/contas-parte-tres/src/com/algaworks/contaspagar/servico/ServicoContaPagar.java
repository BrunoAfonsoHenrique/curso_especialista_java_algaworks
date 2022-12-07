package com.algaworks.contaspagar.servico;

import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.pagamento.*;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public
    ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento){
        metodoPagamento.pagar(documento);
    }
}
