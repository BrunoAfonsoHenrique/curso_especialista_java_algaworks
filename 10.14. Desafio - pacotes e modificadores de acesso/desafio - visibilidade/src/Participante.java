public class Participante {

    static final int SALDO_DE_PONTOS = 0;

    private String nome;

    private int saldoDePontos;

//    public Participante() {
//        this("Sem nome");
//    }

    public Participante(String nome) {
        this(nome, SALDO_DE_PONTOS);

    }

    private Participante(String nome, int saldoDePontos) {
        if (nome == null) {
            throw new IllegalArgumentException("NOME NAO PODE SER NULO/NULL");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }

    public void creditarPontos(int pontos) {
        if (pontos < 0) {
            throw new IllegalArgumentException("Pontos a creditar não pode ser negativo");
        }

        this.saldoDePontos += pontos;
    }
}
