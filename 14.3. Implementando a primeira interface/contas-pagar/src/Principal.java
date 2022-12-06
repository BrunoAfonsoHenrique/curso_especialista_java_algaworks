import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.DocumentoPagavel;

public class Principal {

    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        // Precisamos instaciar uma classe que implemente a interface
        DocumentoPagavel documentoPagavel = null;

        servicoContaPagar.pagar(documentoPagavel);
    }
}
