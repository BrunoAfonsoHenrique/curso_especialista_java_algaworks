public class Principal {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();

        novoVisitante.nome = "Joao";
        novoVisitante.idade = 21;

        if (novoVisitante.possuiAcessoRestritoPorIdade()){
            System.out.println("Acesso não permitido para menores de 18 anos");
        } else {
            System.out.println("Acesso liberado!");
        }
    }
}
