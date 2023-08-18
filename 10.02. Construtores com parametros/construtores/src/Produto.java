public class Produto {

    static final int QUANTIDADE_ESTOQUE_INCIAL = 100;

    String nome;
    int quantidadeEstoque;

    Produto(String nome) {
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INCIAL;
    }

}