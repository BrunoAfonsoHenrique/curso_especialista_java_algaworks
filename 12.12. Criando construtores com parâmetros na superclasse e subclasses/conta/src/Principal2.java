import com.algaworks.conta.ContaInvestimento;
import com.algaworks.conta.Titular;

public class Principal2 {

    public static void main(String[] args) {


        ContaInvestimento conta1 = new ContaInvestimento(new Titular("Bruno Afonso", "44455566677"),
                1234, 9999);


        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }

}