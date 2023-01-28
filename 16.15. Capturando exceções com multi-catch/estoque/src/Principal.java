import estoque.BaixaEstoqueException;
import estoque.Produto;
import estoque.ProdutoException;
import estoque.ProdutoSemEstoqueException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Iphone");
        produto.ativar();
        produto.adicionarEstoque(20);

        comprar(produto);
    }

    public static void comprar(Produto produto) {
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.printf("Quantidade: ");
                int quantidade = sc.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.printf("Compra realizada");

                break;
            } catch (BaixaEstoqueException e) {
                System.out.println("Erro: " + e.getCause().getMessage());
               // e.printStackTrace();

            }
        } while(true);

    }

    public static void efetuarBaixaEstoque(Produto produto, int quantidade) throws BaixaEstoqueException {
        try {
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual %d%n ",
                    quantidade, produto.getQuantidadeEstoque());
        } catch (IllegalArgumentException | ProdutoException e) {
            throw new BaixaEstoqueException("Erro ao realizar baixa no estoque", e);
        }

    }

}