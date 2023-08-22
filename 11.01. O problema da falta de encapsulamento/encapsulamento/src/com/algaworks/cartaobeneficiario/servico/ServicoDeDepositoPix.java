package com.algaworks.cartaobeneficiario.servico;

import com.algaworks.cartaobeneficiario.Cartao;
import com.algaworks.cartaobeneficiario.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {

        //TODO faz cobrança do valor do pix

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de deposito nao pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Deposito", valorDeposito);
    }
}
