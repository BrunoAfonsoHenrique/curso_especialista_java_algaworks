public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        //poderia ter calculos mais complexos aqui. Depende da lógica de negócio

        produto.precoVenda = produto.precoCusto
                * ((percentualMargemLucro / 100) + 1);


    }
}
