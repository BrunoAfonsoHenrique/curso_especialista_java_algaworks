
import financeira.modelo.Funcionario;
import financeira.modelo.PessoaBonificavel;
import financeira.servico.ServicoPagamentoBonus;

public class Principal2 {

    public static void main(String[] args) {
        PessoaBonificavel funcionario = new Funcionario("Joao da Silva",18_000);
        funcionario.calcularBonus(80);

        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario, 80);
    }
}
