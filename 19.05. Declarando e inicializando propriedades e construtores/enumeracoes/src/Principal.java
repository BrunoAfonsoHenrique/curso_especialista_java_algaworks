public class Principal {

    public static void main(String[] args) {
//        System.out.println(StatusPedido.EMITIDO.ordinal());
//        String nomeStatus = StatusPedido.EMITIDO.toString();
//        System.out.println(StatusPedido.EMITIDO.name());

//        for (StatusPedido value : StatusPedido.values()) {
//            System.out.printf("Status -> %d - %s%n", value.ordinal(), value.name());
//        }

//        String textoStatus = "CANCELADO";
//        StatusPedido status = StatusPedido.valueOf(textoStatus);
//        System.out.println(status.ordinal() + " - " + status.name());

        int numero = 1;
        StatusPedido status = StatusPedido.values()[numero];
        System.out.println(status.ordinal() + " - " + status.name());

    }


}
