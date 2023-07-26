public class Principal {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("Joao da Sila");
        pedido.setValorTotalPedido(90);
//        pedido.marcarComoEntregue();
        pedido.emitir();

        pedido.cancelar();
        System.out.println(pedido.getStatus());

//        System.out.println(pedido.getTempoEntregaEmHoras());


    }


}
