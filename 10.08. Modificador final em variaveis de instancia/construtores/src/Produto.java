import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INCIAL = 100;

    final String codigo;
    String nome;
    int quantidadeEstoque;

    Produto() {
        this("Sem nome");

    }

    Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INCIAL);

    }

    Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        if (estoqueInicial < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.codigo = UUID.randomUUID().toString(); // Gera um código aleatório
    }

}