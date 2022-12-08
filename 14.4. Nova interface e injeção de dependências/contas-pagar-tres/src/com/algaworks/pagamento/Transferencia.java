package com.algaworks.pagamento;

public class Transferencia implements MetodoDePagamento{


    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.pegarBeneficiario();

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("BENEFICIARIO NAO POSSUI PODE FAZER TRANFERENCIA");
        }

        System.out.printf("Efetuando tranferencia para %s no valor de %.2f para conta bancaria %s%n",
                beneficiario.getNome(), documento.pegarValorTotal(), beneficiario.getContaBancaria());
    }
}
