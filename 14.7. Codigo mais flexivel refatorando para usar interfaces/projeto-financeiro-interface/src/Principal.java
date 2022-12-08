import financeira.modelo.Fazenda;
import financeira.modelo.Funcionario;
import financeira.modelo.Industria;
import financeira.modelo.ParceiroFinanceiro;
import financeira.servico.ServicoFinanciamento;

public class Principal {

    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        var parceiro = new ParceiroFinanceiro("Capital ABC", 2_000_000);
        Funcionario funcionario = new Funcionario("João da Silva", 18_000);

        servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
    }

}