import java.util.Objects;

public class Participante {

    static final int SALDO_DE_PONTOS = 0;

    String nome;

    int saldoDePontos;

    public Participante() {
        this("Sem nome");
    }

    public Participante(String nome) {
        this(nome, SALDO_DE_PONTOS);

    }

    public Participante(String nome, int saldoDePontos) {
        if (nome == null) {
            throw new IllegalArgumentException("NOME NAO PODE SER NULO/NULL");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }
}
