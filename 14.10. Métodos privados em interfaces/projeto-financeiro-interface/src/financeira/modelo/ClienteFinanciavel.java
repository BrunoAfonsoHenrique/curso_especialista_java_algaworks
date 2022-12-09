package financeira.modelo;

public interface ClienteFinanciavel {

    public abstract double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isFinancimentoPequenoValor(valorSolicitado)) {
            return 1.0;
        } else if (isFinanciamentoGrandeValor(valorSolicitado)) {
            return 1.5;
        }
        return 2.0;
    }

    private boolean isFinancimentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }

    private static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }


}
