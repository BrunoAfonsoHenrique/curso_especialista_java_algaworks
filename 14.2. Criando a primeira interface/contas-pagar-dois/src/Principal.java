import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.DocumentoPagavel;

public class Principal {

    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        DocumentoPagavel documento = null;

        servicoContaPagar.pagar(documento);

    }
}
