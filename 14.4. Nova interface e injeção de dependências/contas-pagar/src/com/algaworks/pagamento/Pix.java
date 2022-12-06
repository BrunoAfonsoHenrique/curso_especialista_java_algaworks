package com.algaworks.pagamento;

public class Pix implements MetodoPagamento {

    @Override
    public void pagar(DocumentoPagavel documento) {

        Beneficiario beneficiario = documento.pegarBeneficiario();

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("BENEFICIARIO NAO POSSUI CHAVE PIX");
        }

        System.out.printf("DEBUG: Efetuando Pix para %s no valor de %.2f com chave %s%n",
                beneficiario.getNome(), documento.pegarValorTotal(), beneficiario.getChavePix());
    }
}
