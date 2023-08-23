package cartaobeneficiario.servico;

import com.algaworks.cartaobeneficiario.Cartao;
import com.algaworks.cartaobeneficiario.Estabelecimento;
import com.algaworks.cartaobeneficiario.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {

        cartao.debitar(valor);

        // TODO realiza outras lógica para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.obeterTitular(), "Pagamento", valor);
    }
}
