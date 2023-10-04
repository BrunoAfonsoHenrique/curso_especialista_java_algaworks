import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {

        Titular titular = new Titular("João da Silva", "12312312300");
        ContaEspecial conta1 = new ContaEspecial(titular, 1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);
        conta1.depositar(300);

        Conta conta = conta1; //Upcasting


//        ContaInvestimento contaInvestimento =  (ContaInvestimento) contaEspecial; //Upcasting

//        System.out.println(contaEspecial.getClass().getName());
//        System.out.println(conta.getClass().getName());
//
//        System.out.println(contaEspecial == conta);

    }
}
