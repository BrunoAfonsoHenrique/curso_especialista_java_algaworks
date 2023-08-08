public class Cachorro {

    private String nome;

    private int idade;

    private String raca;

    private String sexo;

    public Cachorro() {

    }

    public Cachorro(String nome, int idade, String raca, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nome = '" + nome + '\'' +
                ", idade = " + idade +
                ", raca = '" + raca + '\'' +
                ", sexo = '" + sexo + '\'';
    }
}
