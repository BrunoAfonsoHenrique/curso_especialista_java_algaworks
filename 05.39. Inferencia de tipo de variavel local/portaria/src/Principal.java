public class Principal {

    public static void main(String[] args) {
        var novoVisitante = new Visitante();

        novoVisitante.nome = "Joao";
        novoVisitante.idade = 15;

        var cadastroPortaria = new CadastroPortaria();
        // Pouco legivel com uso de var
        var resultado = cadastroPortaria.cadastrar(novoVisitante, 10);
        cadastroPortaria.cadastrar(novoVisitante);
    }
}
