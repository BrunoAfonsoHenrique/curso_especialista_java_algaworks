package algaworks.algabank;

import algaworks.javabank.Conta;

public class PontuacaoDecorator implements Conta {

    private Conta contaOriginal;
    private int pontos;

    public int getPontos() {
        return pontos;
    }

    public PontuacaoDecorator(Conta contaOriginal) {
        this.contaOriginal = contaOriginal;

    }

    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
        pontos += valor / 100;
    }

    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        contaOriginal.aplicarEmInvestimento(valor);
    }
}
