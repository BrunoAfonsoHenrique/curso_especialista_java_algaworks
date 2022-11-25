import com.algaworks.banco.*;

public class Principal2 {

    Titular titular = new Titular("Joao da Sila", "11122233344");
    Conta conta = new ContaSalario(titular, 1234, 999999, 18_000);
}
