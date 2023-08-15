import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        VideoGame playstation = new VideoGame();
        playstation.nome = "Sony Plastation 5";
        playstation.fabricante = "Sony";

        Jogo game1 = new Jogo();
        game1.nome = "The Last Guardian";
        game1.plataforma = "Playstation";
        game1.produtora = "XXX";

        Jogo game2 = new Jogo();
        game2.nome = "Good of War Ragnarok";
        game2.plataforma = "Playstation";
        game2.produtora = "YYY";

        playstation.adicionarJogo(game1);
        playstation.adicionarJogo(game2);
        playstation.imprimirListaDeJogos();



    }
}
