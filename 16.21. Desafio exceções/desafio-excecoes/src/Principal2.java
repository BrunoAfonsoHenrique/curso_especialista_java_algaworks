import com.algaworks.banco.*;

public class Principal2 {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123");
        ContaCorrente conta2 = new ContaCorrente("987");

        conta1.ativar();
        try {
            conta1.depositar(1_000);
        } catch (ContaInativaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ValorDepositoNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            conta1.transferir(conta2, 500);
        } catch (ContaInativaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ValorDepositoNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ContaSemSaldoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ValorNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());
    }

}