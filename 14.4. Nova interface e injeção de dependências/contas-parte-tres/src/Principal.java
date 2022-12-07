import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.*;

import javax.print.Doc;

public class Principal {

    public static void main(String[] args) {

        MetodoPagamento metodoPagamento = new Tranferencia();

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Bruno Afonso", "44445555", "1304");
        DocumentoPagavel holerite = new Holerite(funcionario, 100, 168);
        servicoContaPagar.pagar(holerite);

        Beneficiario fornecedor = new Beneficiario("Consultoria AlgaWorks", "11122266644477","5600");
        DocumentoPagavel ordemServico = new OrdemServico(fornecedor, 65_500);
        servicoContaPagar.pagar(ordemServico);

    }
}
