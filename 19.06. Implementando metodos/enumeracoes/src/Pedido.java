public class Pedido {


    private String nomeCliente;
    private double valorTotalPedido;

    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public StatusPedido getStatus() {
        return status;
    }

//    public void setStatus(StatusPedido status) {
//        this.status = status;
//    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public int getTempoEntregaEmHoras() {
        return status.getTempoEntregaEmHoras();
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public void marcarComoEntregue() {
        status = StatusPedido.ENTREGUE;
    }

    public void emitir() {
        status = StatusPedido.EMITIDO;
    }

    public void cancelar() {
        if (getStatus().podeMudarParaCancelado(getValorTotalPedido())) {
            status = StatusPedido.CANCELADO;
        }
        else {
            throw new IllegalStateException("PEDIDO NAO PODE SER CANCELADO");
        }
    }
}
