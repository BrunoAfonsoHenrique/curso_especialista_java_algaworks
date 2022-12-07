package com.algaworks.pagamento;

public class Tranferencia implements MetodoPagamento{

    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.pegarBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("BENEFICIARIO NAO POSSUI CHAVE CONTA BANCARIA");
        }

        System.out.printf("Efetuando tranferencia para %s no valor de %.2f para conta bancaria %s%n",
                beneficiario.getNome(), documento.pegarValorTotal(), beneficiario.getContaBancaria());

    }

}
