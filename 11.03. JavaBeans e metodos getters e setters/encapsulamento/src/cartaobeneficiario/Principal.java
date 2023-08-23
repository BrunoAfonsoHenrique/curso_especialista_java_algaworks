package cartaobeneficiario;

import com.algaworks.cartaobeneficiario.servico.ServicoDePagamentoOnline;

public class Principal {

    public static void main(String[] args) {
        Estabelecimento supermercado = new Estabelecimento("Supermercado do Zé");
        Cartao cartao = new Cartao("João Souza Silva");

        var servicoDeDeposito = new com.algaworks.cartaobeneficiario.servico.ServicoDeDepositoPix();
        com.algaworks.cartaobeneficiario.Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.getTitular());
        System.out.printf("Saldo: R$%.2f%n", cartao.getSaldo());
    }

}