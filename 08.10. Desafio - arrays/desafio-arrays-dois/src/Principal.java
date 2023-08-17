public class Principal {

    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();

        ItemCardapio item1 = new ItemCardapio();
        item1.preco = 95;
        item1.descricao = "Lasanha";

        cardapio.adicionarItem(item1);

        cardapio.imprimirItensCardapio(80, 150);
        cardapio.removerItem(0);
        cardapio.imprimirItensCardapio(80, 150);



    }
}