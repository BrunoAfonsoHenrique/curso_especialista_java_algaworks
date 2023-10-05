import com.algaworks.banco.CaixaEletronico;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaSalario;
import com.algaworks.banco.Titular;

public class Principal3 {

    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        Titular titular = new Titular("João da Silva", "12312312300");
        ContaEspecial conta1 = new ContaEspecial(titular, 1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);

        Titular titular2 = new Titular("Maria da Silva", "22233388899");
        ContaEspecial conta2 = new ContaEspecial(titular2, 4321, 888888, 90);

        Titular titular3 = new Titular("Francisco da Sila", "44444455599");
        ContaSalario conta3 = new ContaSalario(titular3, 5555, 777777, 18_000);

        conta3.depositar(300);

//        caixaEletronico.transferir(conta1, conta2, 50);
//        conta1.imprimirDemonstrativo();
//        conta2.imprimirDemonstrativo();

        caixaEletronico.transferir(conta1, conta3, 50);
        conta1.imprimirDemonstrativo();
        conta3.imprimirDemonstrativo();



    }
}
