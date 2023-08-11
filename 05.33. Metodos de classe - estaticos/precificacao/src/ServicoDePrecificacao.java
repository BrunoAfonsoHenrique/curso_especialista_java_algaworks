public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        //poderia ter calculos mais complexos aqui. Depende da lógica de negócio

        double precoVendaCalculado = MatematicaUtil.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;

    }
}
