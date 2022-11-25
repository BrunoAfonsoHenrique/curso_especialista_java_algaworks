import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaSalario;
import com.algaworks.banco.Titular;

public class Principal2 {

    Titular titular = new Titular("Joao da Sila", "11122233344");
    Conta conta = new ContaSalario(titular, 1234, 999999, 18_000);
}
