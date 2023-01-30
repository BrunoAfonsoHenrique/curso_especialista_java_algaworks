package com.algaworks.banco;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public boolean sacar(double valor) throws ContaInativaException, ValorNegativoException, ContaSemSaldoException {
        if (valor <= 0) {
            throw new ValorNegativoException("Valor de saque deve ser maior que 0");
        }

        if (valor > this.saldo) {
            throw new ContaSemSaldoException("Conta sem saldo");
        }

        if (isInativa()) {
            throw new ContaInativaException("Conta não pode estar inativa pararealizar transações");
        }

        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) throws ContaInativaException, ValorDepositoNegativoException {
        if (valor <= 0) {
            throw new ValorDepositoNegativoException("Valor do deposito não pode ser negatvo");
        }

        if (isInativa()) {
            throw new ContaInativaException("Conta não pode estar inativa pararealizar transações");
        }

        this.saldo += valor;
        return true;
    }

    public boolean transferir(ContaCorrente contaDestino, double valor) throws ContaInativaException, ValorDepositoNegativoException, ContaSemSaldoException, ValorNegativoException {
        if (contaDestino.isInativa()) {
            throw new ContaInativaException("Conta não pode estar inativa pararealizar transações");
        }

        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }

        return false;
    }

}
