import com.algaworks.banco.CaixaEletronico;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaSalario;
import com.algaworks.banco.Titular;

public class Principal {

    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "12312312300"),
                1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);

        ContaEspecial conta2 = new ContaEspecial(new Titular("Maria Joana", "98798798700"),
                2222, 888888, 90);

        ContaSalario conta3 = new ContaSalario(new Titular("Franciso Souza", "44455566677"),
                3333, 777777, 18000);

        conta1.depositar(300);

        caixaEletronico.transferir(conta1, conta3, 50.0);
        conta1.imprimirDemonstrativo();
        conta3.imprimirDemonstrativo();

    }
}
