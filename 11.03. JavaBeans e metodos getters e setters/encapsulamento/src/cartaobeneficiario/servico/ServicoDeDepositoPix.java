package cartaobeneficiario.servico;

import com.algaworks.cartaobeneficiario.Cartao;
import com.algaworks.cartaobeneficiario.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.obeterTitular(), "Deposito", valorDeposito);
    }
}
