import estoque.Produto;

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
        System.out.printf("Quantidade: ");
        int quantidade = sc.nextInt();

        efetuarBaixaEstoque(produto, quantidade);
        System.out.printf("Compra realizada");

    }

    public static void efetuarBaixaEstoque(Produto produto, int quantidade) {
        try {
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual %d%n ",
                    quantidade, produto.getQuantidadeEstoque());
        }
        catch (IllegalArgumentException e) { // e -> nome da variavel que vai referenciar o objeto da excecao
            // instruções para tratamento adequado da excecao
            System.out.println("Erro ao efetuar baixa no estoque: " + e.getMessage());
        }

    }
}