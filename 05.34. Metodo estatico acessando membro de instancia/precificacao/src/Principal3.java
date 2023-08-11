import com.algaworks.precificacao.Produto;

public class Principal3 {

    public static void main(String[] args) {

        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();

        produto.alterarPrecoCusto(100);

        System.out.printf("Total preço custo: R$%.2f%n",
                Produto.calulcarCustosTotais(produto));

    }
}