public class CadastroPortaria {

    static final int TEMPO_DE_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(final Visitante visitante, final int tempoDeExpiracaoEmMeses) {
        // visitante = new Visitante(); // erro  -> Não compila
        visitante.idade += 10; // Compila

        final int tempoExpiracaoEmdias;
        tempoExpiracaoEmdias = tempoDeExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias %n",
                visitante.nome, tempoExpiracaoEmdias);

    }

    void cadastrar(final Visitante visitante) {
        this.cadastrar(visitante, TEMPO_DE_EXPIRACAO_PADRAO_EM_MESES);
    }
}
