public class CadastroPortaria {

    static final int TEMPO_DE_EXPIRACAO_PADRAO_EM_MESES = 1;

    int cadastrar(final Visitante visitante, final int tempoDeExpiracaoEmMeses) {
        visitante.idade += 10; // Compila

        final var tempoExpiracaoEmdias = tempoDeExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias %n",
                visitante.nome, tempoExpiracaoEmdias);

        return 1;

    }

    void cadastrar(final Visitante visitante) {
        this.cadastrar(visitante, TEMPO_DE_EXPIRACAO_PADRAO_EM_MESES);
    }
}
