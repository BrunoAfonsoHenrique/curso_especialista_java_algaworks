package com.algaworks.contaspagar.servico;

import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.DocumentoPagavel;

public class ServicoContaPagar {

    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.pegarBeneficiario();

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("BENEFICIARIO NAO POSSUI CHAVE PIX");
        }

        System.out.printf("Efetuando PIX para %s no valor de %.2f com chave Pix %s",
                beneficiario.getNome(), documento.pegarValorTotal(), beneficiario.getChavePix());

    }
}
