import com.algaworks.banco.ContaCorrente;
import com.algaworks.banco.ContaInativaException;
import com.algaworks.banco.ValorDepositoNegativoException;

public class Principal1 {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123");

        try {
            conta1.depositar(1_000);
        } catch (ContaInativaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ValorDepositoNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
    }

}