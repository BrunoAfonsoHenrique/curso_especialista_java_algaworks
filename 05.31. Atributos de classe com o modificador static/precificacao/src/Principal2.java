public class Principal2 {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Produto.custoEmbalagem = 20;

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();


    }
}