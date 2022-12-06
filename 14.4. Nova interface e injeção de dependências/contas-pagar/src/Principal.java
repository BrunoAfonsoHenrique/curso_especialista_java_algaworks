import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.MetodoPagamento;
import com.algaworks.pagamento.Pix;
import com.algaworks.pagamento.Transferencia;

public class Principal {

    public static void main(String[] args) {

        MetodoPagamento metodoPagamento = new Transferencia();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Joao da Silva", "44445555", "3458");
        Holerite holerite = new Holerite(funcionario, 100, 168);
        servicoContaPagar.pagar(holerite);

        System.out.println("--------------------------------------------------------------------------");

        Beneficiario fornecedor = new Beneficiario("Consultoria AlgaWorks", "11122333", "4520");
        OrdemServico ordemServico = new OrdemServico(fornecedor, 65_500);
        servicoContaPagar.pagar(ordemServico);
    }
}
