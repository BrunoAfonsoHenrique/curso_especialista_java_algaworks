public class CadastroPortaria {

    void cadastrar(final Visitante visitante, final int tempoExpiracao) {
        // visitante = new Visitante(); // erro  -> Não compila
        visitante.idade += 10; // Compila

        final int tempoExpiracaoEmdias;
        tempoExpiracaoEmdias = tempoExpiracao * 30;

        System.out.printf("Visitante cadastradoi para: %d dias %n",
                visitante.nome, tempoExpiracaoEmdias);

    }
}
