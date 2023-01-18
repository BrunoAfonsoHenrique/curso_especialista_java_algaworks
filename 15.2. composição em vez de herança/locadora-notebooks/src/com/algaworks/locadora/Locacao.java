package com.algaworks.locadora;

public class Locacao {

    private Notebook notebook;
    private Precificacao precificacao;
    private Seguro seguro;

    public Locacao(Notebook notebook, Precificacao precificacao) {
        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
        this(notebook, precificacao);
//        this.notebook = notebook;
//        this.precificacao = precificacao;
        this.seguro = seguro;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }


    public Precificacao getPrecificacao() {
        return precificacao;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = getPrecificacao()
                .calcularValorTotal(getNotebook(), horasUtilizadas);

        if (temSeguro()) {
            valorTotal += getSeguro().calcularValorSeguro(horasUtilizadas, valorTotal);
        }
        return valorTotal;
    }

    private boolean temSeguro() {
        return this.seguro != null;
    }

}
