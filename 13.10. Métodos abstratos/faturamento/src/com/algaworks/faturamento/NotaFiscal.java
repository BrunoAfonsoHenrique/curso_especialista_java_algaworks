package com.algaworks.faturamento;

public abstract class NotaFiscal {

    private String descricao;
    private double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public double getValorTotal() {

        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {

        this.valorTotal = valorTotal;
    }

    public abstract double calcularImpostos();

    public void emitir() {
        System.out.printf("Emitindo nota fiscal para: %s%n" , getDescricao());
        System.out.printf("ValorTotal: %s%n" , getValorTotal());
        System.out.printf("Impostos: %.2f%n" , calcularImpostos());
    }
}
