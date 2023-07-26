public class Principal {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("Joao da Sila");
        pedido.setStatus(StatusPedido.EMITIDO);

        System.out.println(pedido.getTempoEntregaEmHoras());


    }


}
