package estoque;

import java.util.Objects;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            //throw new NullPointerException("NOME DEVE SER INFORMADO");
            Objects.requireNonNull(nome, "NOME DEVE SER INFORMADO");
        }
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void retirarEstoque(int quantidade) {
        if (quantidade < 0) {
//          IllegalArgumentException excecao = new IllegalArgumentException("Quantidade não pode ser negativa para retirada do estoque");
            throw new IllegalArgumentException("QUANTIDADE NÃO PODE SER " +
                    "NEGATIVA PARA RETIRADA DO ESTOQUE\n");
        }
        if (isInativo()) {
            throw new IllegalStateException("RETIRADA NO ESTOQUE NAO PODE SER REALIZADA EM PRODUTOS INATIVOS");
        }

        if (this.quantidadeEstoque - quantidade < 0) {
            throw new IllegalArgumentException("QUANTIDADE INVALIDA PORQUE O ESTOQUE VAI FICAR NEGATIVO");
        }

        this.quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }
}