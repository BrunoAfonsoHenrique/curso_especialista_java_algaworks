import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        // TODO implementar inclusão de item do cardápio
        this.itens = Arrays.copyOf(this.itens, this.itens.length + 1);
        itens[itens.length - 1] = item;

    }

    void removerItem(int indice) {
        // TODO implementar exclusão de item do cardápio da posição informada
        ItemCardapio[] novosItensCardapio = new ItemCardapio[itens.length - 1];

        System.arraycopy(itens, 0, novosItensCardapio, 0, indice);

        System.arraycopy(itens, indice + 1,
                novosItensCardapio, indice, novosItensCardapio.length - indice);

        itens = novosItensCardapio;

        System.out.println("Item removido...");
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        // TODO implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo
        for (ItemCardapio iten : itens) {
            if (iten.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                iten.imprimir();
            }
        }


    }
}
