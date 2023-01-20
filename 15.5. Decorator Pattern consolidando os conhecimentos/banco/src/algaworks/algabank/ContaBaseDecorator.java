package algaworks.algabank;

import algaworks.javabank.Conta;

public class ContaBaseDecorator implements Conta {

    private Conta contaOriginal;

    public ContaBaseDecorator(Conta conta) {
        this.contaOriginal = conta;
    }

    public Conta getContaOriginal() {
        return contaOriginal;
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
    }

    @Override
    public void transferir(Conta conta, double valor) {
        this.contaOriginal.transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        contaOriginal.aplicarEmInvestimento(valor);
    }
}
