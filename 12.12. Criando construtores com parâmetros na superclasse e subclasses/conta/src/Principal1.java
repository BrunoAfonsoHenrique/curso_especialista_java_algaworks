import com.algaworks.conta.Conta;
import com.algaworks.conta.Titular;

public class Principal1 {

    public static void main(String[] args) {

        Conta conta1 = new Conta(new Titular("Bruno Afonso", "44455566677"),
                1234, 111);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(27.5);
        conta1.imprimirDemonstrativo();

    }

}