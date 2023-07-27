public class NotaFiscal {

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusEnum status = StatusEnum.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void cancelar() {
        if ((StatusEnum.EMITIDA.equals(status) && getValor() >= 1_000)
                || status == StatusEnum.CANCELADA) {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }

        status = StatusEnum.CANCELADA;
    }

    public void emitir() {
        if (StatusEnum.EMITIDA.equals(status) || StatusEnum.CANCELADA.equals(status)) {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }

        status = StatusEnum.EMITIDA;
    }

    public String getDescricaoCompleta() {
        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), status);
    }

}