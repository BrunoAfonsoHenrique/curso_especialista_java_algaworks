import com.algaworks.crm.Cliente;
import com.algaworks.crm.MenorDeIdadeException;
import com.algaworks.crm.ServicoCadastroCliente;

public class Principal {

    public static void main(String[] args) {

        try {
            ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();
            Cliente cliente = servicoCadastroCliente.cadastrar("Joao", 15);
            System.out.printf("Cliente cadastrado: %s%n ", cliente.getNome());
        } catch (MenorDeIdadeException e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }
}
