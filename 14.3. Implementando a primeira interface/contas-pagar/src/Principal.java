import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.Beneficiario;

public class Principal {

    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario funcionario = new Beneficiario("Joao da Silva", "44445555", "3458");
        Holerite holerite = new Holerite(funcionario, 100, 168);
        servicoContaPagar.pagar(holerite);

        System.out.println("--------------------------------------------------------------------------");

        Beneficiario fornecedor = new Beneficiario("Consultoria AlgaWorks", "11122333", "4520");
        OrdemServico ordemServico = new OrdemServico(fornecedor, 65_500);
        servicoContaPagar.pagar(ordemServico);
    }
}
