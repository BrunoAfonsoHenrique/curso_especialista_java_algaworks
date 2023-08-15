import java.util.Arrays;

public class VideoGame {

    String nome;

    String fabricante;

    Jogo[] jogos = new Jogo[0];

    void adicionarJogo(Jogo jogo) {
        this.jogos = Arrays.copyOf(this.jogos, this.jogos.length + 1);
        jogos[jogos.length - 1] = jogo;
    }

    void imprimirListaDeJogos() {
        for (Jogo jogo : jogos) {
            if (jogo != null) {
                System.out.printf("Jogo: %s, Produtora: %s, Plataforma: %s%n", jogo.nome, jogo.produtora, jogo.plataforma);
            }
        }

    }
}
