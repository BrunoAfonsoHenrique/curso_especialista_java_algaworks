import com.algaworks.cartaobeneficiario.Cartao;
import com.algaworks.cartaobeneficiario.Estabelecimento;
import com.algaworks.cartaobeneficiario.Recibo;
import com.algaworks.cartaobeneficiario.servico.ServicoDeDepositoPix;
import com.algaworks.cartaobeneficiario.servico.ServicoDePagamentoOnline;

public class Principal {

    public static void main(String[] args) {

        Estabelecimento supermercado = new Estabelecimento("Supermercado do Zé");

        Cartao cartao = new Cartao("José souza da silva");
//        cartao.saldo = 500;

        ServicoDeDepositoPix servicoDeDepositoPix = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servicoDeDepositoPix.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        ServicoDePagamentoOnline servico = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servico.efetuarPagamento(supermercado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.titular);
        System.out.printf("Saldo: R$%.2f%n", cartao.saldo);

    }
}
