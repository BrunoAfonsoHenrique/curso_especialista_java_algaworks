public class ExemploBoolean {

    public static void main(String[] args) {
        boolean compraAprovada = true;
        boolean clienteBloqueado = false;

        System.out.println(compraAprovada);
        System.out.println(clienteBloqueado);

        int quantidadeEstoque = 10;
        int quantidadePedidoDeCompra = 9;

        boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoDeCompra;
        System.out.println("Estoque diponivel: " + estoqueSuficiente);
    }
}
