package com.algaworks.pagamento;

public class Transferencia implements MetodoPagamento {

    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.pegarBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("BENEFICIARIO NAO POSSUI CHAVE PIX");
        }

        System.out.printf("DEBUG: Efetuando transferencia para %s no valor de %.2f para conta bancaria %s%n",
                beneficiario.getNome(), documento.pegarValorTotal(), beneficiario.getContaBancaria());
    }
}
