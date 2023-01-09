package financeira.modelo;

public interface ClienteFinanciavel {

    public static final int IDADE = 0;
    double JUROS_BAIXO_RISCO = 1.0;
    double JUROS_MEDIO_RISCO = 1.5;
    double JUROS_ALTO_RISCO = 2.0;

    public abstract double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (ClienteFinanciavel.isFinancimentoPequenoValor(valorSolicitado)) {
            return JUROS_BAIXO_RISCO;
        } else if (ClienteFinanciavel.isFinanciamentoGrandeValor(valorSolicitado)) {
            return JUROS_MEDIO_RISCO;
        }
        return JUROS_ALTO_RISCO;
    }

    static boolean isFinancimentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }

    static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }


}
