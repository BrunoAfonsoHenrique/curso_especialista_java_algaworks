package com.algaworks.pagamento;

public class Pix implements MetodoPagamento {

    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.pegarBeneficiario(); // Obtendo o beneficiario

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("BENEFICIARIO NAO POSSUI CHAVE PIX");
        }

        System.out.printf("Efetuando PIX para %s no valor de %.2f com chave Pix %s%n",
                beneficiario.getNome(), documento.pegarValorTotal(), beneficiario.getChavePix());
    }
}
