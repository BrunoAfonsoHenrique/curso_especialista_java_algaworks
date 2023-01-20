package algaworks.javabank;

public interface Conta {

    double getSaldo();
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta conta, double valor);
    void aplicarEmInvestimento(double valor);
    default void imprimirSaldo() {
        System.out.printf("Seu daldo é de: R$%.2f", getSaldo());
    }


}
