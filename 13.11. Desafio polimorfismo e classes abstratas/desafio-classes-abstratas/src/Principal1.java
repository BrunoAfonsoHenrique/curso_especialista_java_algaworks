import com.algaworks.desafio.GestorDeImpostos;
import com.algaworks.desafio.PessoaFisica;

public class Principal1 {

    public static void main(String[] args) {

        GestorDeImpostos gestorDeImpostos = new GestorDeImpostos();

        PessoaFisica Joao = new PessoaFisica("Joa da Silva", 45_000);
        PessoaFisica maria = new PessoaFisica("Maria Souza", 180_000);


        gestorDeImpostos.adicionar(Joao);
        gestorDeImpostos.adicionar(maria);

        System.out.printf("Total de impostos: %.2f", gestorDeImpostos.getValorTotalImpostos());
    }
}
