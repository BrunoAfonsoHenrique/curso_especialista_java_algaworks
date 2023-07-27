public class ServicoCancelamentoServico {

    public void cancelar(Pedido pedido, TipoUsuario tipoUsuario) {
        pedido.cancelar();

        if (TipoUsuario.CLIENTE.equals(tipoUsuario)) {
            System.out.println("Notificando gerente sobre o cancelamento do pedido");
        }
    }



}
