import estoque.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(null);
        produto.ativar();
        produto.adicionarEstoque(20);

        comprar(produto);
    }

    public static void comprar(Produto produto) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quanidade: ");
        int quantidade = sc.nextInt();

        efetuarBaixaEstoque(produto, quantidade);
        System.out.printf("Compra realizada");

    }

    public static void efetuarBaixaEstoque(Produto produto, int quantidade) {
        produto.retirarEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque. Estoque atual %d%n ",
                quantidade, produto.getQuantidadeEstoque());
    }
}