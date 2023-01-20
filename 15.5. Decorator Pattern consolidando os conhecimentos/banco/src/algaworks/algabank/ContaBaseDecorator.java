package algaworks.algabank;

import algaworks.javabank.Conta;

public class ContaBaseDecorator implements Conta {

    private Conta conta;

    public ContaBaseDecorator(Conta conta) {
        this.conta = conta;
    }

    @Override
    public double getSaldo() {
        return conta.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        conta.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        conta.depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        this.conta.transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        conta.aplicarEmInvestimento(valor);
    }
}
