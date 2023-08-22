package erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INCIAL = 100;

    private final String codigo;
    private String nome;
    private int quantidadeEstoque;

    public Produto() {
        this("Sem nome");

    }

    private Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INCIAL);

    }

    private Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        if (estoqueInicial < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.codigo = gerarCodigo(); // Gera um código aleatório (String)
    }

    private String gerarCodigo() {
        return UUID.randomUUID().toString(); // Gera um código aleatório (String)
    }

}