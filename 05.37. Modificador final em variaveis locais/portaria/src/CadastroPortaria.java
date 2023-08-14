public class CadastroPortaria {

    void cadastrar(final Visitante visitante, final int tempoDeExpiracaoEmMeses) {
        // visitante = new Visitante(); // erro  -> Não compila
        visitante.idade += 10; // Compila

        final int tempoExpiracaoEmdias;
        tempoExpiracaoEmdias = tempoDeExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias %n",
                visitante.nome, tempoExpiracaoEmdias);

    }
}
