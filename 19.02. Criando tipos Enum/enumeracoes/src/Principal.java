public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setStatus(StatusPedido.EMITIDO);
        pedido.setOrigem(OrigemPedido.ONLINE);
//        pedido.setOrigem(89234);

        System.out.println(pedido.getStatus());
        System.out.println(pedido.getOrigem());

    }
}
