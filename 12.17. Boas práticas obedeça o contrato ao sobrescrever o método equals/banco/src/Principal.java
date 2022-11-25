import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.Titular;

public class Principal {
    public static void main(String[] args) {

       Titular titular = new Titular("Joao da Sila", "11122233344");
       Conta conta1 = new Conta(titular, 1234, 999999);
       Conta conta2 = new Conta(titular, 1234, 999999);
       Conta conta3 = new Conta(titular, 1234, 999999);

       // Regras
        System.out.println(conta1.equals(conta1)); // Para uma referencia não nula (ela comparada com ela mesma) deve retornar verdadeiro
        System.out.println(conta1.equals(conta2)); // Isso deve retornar verdadeiro - Regra da simetria
        System.out.println(conta2.equals(conta1)); // Isso deve retornar verdadeiro - Regra da simetria

        // Refrencia transitiva
        System.out.println(conta1.equals(conta2)); // Deve retornar true
        System.out.println(conta2.equals(conta3)); // Deve retornar true
        System.out.println(conta1.equals(conta3)); // Deve retornar true

        // Consistente
        System.out.println(conta1.equals(conta2)); // Varias chamdas devem retornar true ou false consistentemente

        // Qualquer referencia comprada com null deve retornar false
        System.out.println(conta1.equals(null));

        // Regra: Sempre que implementar o Equal você deve implementar o hashCode
    }
}