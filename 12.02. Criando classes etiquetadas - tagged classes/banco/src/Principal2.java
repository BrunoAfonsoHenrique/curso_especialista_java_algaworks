import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {

        Conta conta1 =  new Conta();
        conta1.setTitular(new Titular("Joao da Silva", "12312312300"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);
        conta1.setTipo(Conta.INVESTIMENTO);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();

    }
}
