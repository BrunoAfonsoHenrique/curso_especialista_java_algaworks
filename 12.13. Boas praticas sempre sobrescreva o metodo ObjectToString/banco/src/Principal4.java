import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal4 {

    public static void main(String[] args) {

        Titular titular = new Titular("Bruno Afonso", "11122233344");
//        Conta conta1 = new Conta(titular, 1234, 999999);
//       System.out.println("Sua conta: " + conta1.toString());
        Conta conta1 = new Conta(titular, 1234, 999999);
        System.out.println("Sua conta: " + conta1);
    }
}
