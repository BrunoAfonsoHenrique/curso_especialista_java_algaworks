import com.algaworks.banco.CaixaEletronico;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal {

    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "12312312300"),
                1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);

        ContaEspecial conta2 = new ContaEspecial(new Titular("Maria Joana", "98798798700"),
                2222, 888888, 90);

        conta1.depositar(300);

        caixaEletronico.transferir(conta1, conta2, 50.0);
        conta1.imprimirDemonstrativo();
        conta2.imprimirDemonstrativo();
    }
}
