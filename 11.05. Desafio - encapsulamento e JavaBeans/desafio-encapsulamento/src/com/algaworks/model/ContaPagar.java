package com.algaworks.model;

public class ContaPagar {

    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;

    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void pagar() {
        if (contaEstaPaga()) {
            throw new RuntimeException("CONTA JA ESTA PAGA");
        }
        this.pago = true;
    }

    private boolean contaEstaPaga() {
        return pago == true;
    }

    public void cancelarPagamento() {
        if (contaNaoEstaPaga()) {
            throw new RuntimeException("NAO PODE CANCELAR UM PAGAMENTO QUE AINDA ESTA PENDENTE");
        }
        this.pago = false;
    }

    private boolean contaNaoEstaPaga() {
        return pago == false;
    }
}
