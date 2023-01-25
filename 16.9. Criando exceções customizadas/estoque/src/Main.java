import com.algaworks.estoque.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(null);
        produto.adicionarEstoque(10);
        produto.ativar();

        produto.retirarEstoque(5);

        System.out.printf("Estoque: %d%n", produto.getQuantidadeEstoque());
    }
}