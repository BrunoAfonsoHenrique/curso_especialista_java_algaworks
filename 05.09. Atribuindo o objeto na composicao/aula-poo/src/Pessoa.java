public class Pessoa {

    // Definição somente dos atributos de pessoa
    String nome;

    String cpf;

    int anoNascimento;

    @Override
    public String toString() {
        return "nome = '" + nome + '\'' +
                ", cpf = '" + cpf + '\'' +
                ", anoNascimento = " + anoNascimento ;
    }
}
