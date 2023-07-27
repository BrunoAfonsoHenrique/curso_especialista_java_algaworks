public class Principal {

    public static void main(String[] args) {

        ServicoCancelamentoServico servico = new ServicoCancelamentoServico();


        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setValorTotal(90);

        servico.cancelar(pedido, TipoUsuario.GERENTE);



    }
}
