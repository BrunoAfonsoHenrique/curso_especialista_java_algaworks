import com.algaworks.desafio.EmpresaLucroReal;
import com.algaworks.desafio.EmpresaSimples;
import com.algaworks.desafio.GestorDeImpostos;
import com.algaworks.desafio.PessoaFisica;

public class Principal2 {

    public static void main(String[] args) {
        GestorDeImpostos gestorImpostos = new GestorDeImpostos();

        PessoaFisica joao = new PessoaFisica("João da Silva", 45_000);
        PessoaFisica maria = new PessoaFisica("Maria Souza", 180_000);

        EmpresaSimples barDoZe = new EmpresaSimples("Bar do Zé",
                250_000, 160_000);

        EmpresaLucroReal codeConsultoria = new EmpresaLucroReal("Code Consultoria",
                8_000_000, 6_000_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(codeConsultoria);

        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());
    }
}
