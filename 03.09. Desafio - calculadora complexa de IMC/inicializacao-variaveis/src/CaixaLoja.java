import java.util.Scanner;

public class CaixaLoja {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Preço dos produtos: ");
        double precoProdutos = entrada.nextDouble();

        System.out.println("Cobrar frete? ");
        boolean cobrarFrete = entrada.nextBoolean();

        entrada.close();

        double valorFrete = 0;
        if (cobrarFrete) {
            System.out.println("Valor do frete: ");
            valorFrete = entrada.nextDouble();
        }

        double valorTotal = precoProdutos + valorFrete;

        System.out.printf("Valor total: R$%.2f%n", valorTotal);
    }
}
