package cartaobeneficiario;

import java.io.Serializable;

public class Cartao implements Serializable {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;

    private Boolean ativo;

    public Cartao(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Boolean isAtivo() { // alternativa que pode usar
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void debitar(double valorDebito) {
        if (getSaldo() < valorDebito) {
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        saldo -= valorDebito;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de deposito nao pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        saldo += valorDeposito - TARIFA_DEPOSITO;
    }
}