import com.algaworks.conta.Conta;
import com.algaworks.conta.ContaEspecial;
import com.algaworks.conta.Titular;

public class Principal3 {

    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial(new Titular("Bruno Afonso", "44455566677"),
                1234, 111, 6);
        conta1.setLimiteChequeEspecial(1000.0);


        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();
    }

}