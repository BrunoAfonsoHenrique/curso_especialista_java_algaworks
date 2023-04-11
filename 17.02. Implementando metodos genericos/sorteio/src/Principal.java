import com.algaworks.sorteio.Cliente;
import com.algaworks.sorteio.Sorteador;

public class Principal {

    public static void main(String[] args) {
        String[] nomes = {"Joao, jose, maria"};
        String nomeSorteado =  Sorteador.sortear(nomes);

        Cliente[] clientes = {
                new Cliente("Supermercado Pague e Leve", 2_000_000),
                new Cliente("Posto de Gasolina", 800_000),
                new Cliente("Javac Consultoria", 28_000_000)
        };

        Cliente clienteSorteado =  Sorteador.<Cliente>sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());

    }
}
