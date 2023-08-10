public class Funcionario {

    String nome;

    int quantidadeDeFilhos;

    boolean possuiFilhos() {
        if (quantidadeDeFilhos >= 1) {
            return true;
        }
        return false;
    }

}
