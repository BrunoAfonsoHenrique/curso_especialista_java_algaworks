public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        //poderia ter calculos mais complexos aqui. Depende da lógica de negócio

        double precoVendaCalculado = produto.precoCusto
                * ((percentualMargemLucro / 100) + 1);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;

    }
}
