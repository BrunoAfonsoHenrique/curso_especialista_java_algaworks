import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaSalario;
import com.algaworks.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {

        Titular titular = new Titular("João da Silva", "12312312300");
        Conta contaInvestimento = new ContaSalario(titular,
                1234,
                999999,
                18_000); // UpCasting
        
    }
}
