

import estoque.Produto;
import estoque.ProdutoInativoException;
import estoque.ProdutoSemEstoqueException;

import java.util.Scanner;

public class Main {
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
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());

            } catch (ProdutoSemEstoqueException e) {
                System.out.printf("Erro na compra: %s. Estoque disponivel: %d. Estoque necessario: %d%n",
                        e.getMessage(), e.getEstoqueDisponivel(), e.getEstoqueNecessario());
 //               System.out.println("Erro: " + e.getMessage());

            } catch (ProdutoInativoException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.printf("Deseja ativa o produto? ");

                if (sc.nextBoolean()) {
                    produto.ativar();
                    System.out.printf("OK. Produto ativado com sucesso.");
                } else {
                    System.out.printf("OK. Compra não pode ser realizada");
                    break;
                }
            }
        } while(true);

    }

    public static void efetuarBaixaEstoque(Produto produto, int quantidade) {
        produto.retirarEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque. Estoque atual %d%n ",
                quantidade, produto.getQuantidadeEstoque());
    }

}