import java.util.Scanner;

public class SimuladorEmprestimo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor do empréstimo: ");
        double valorEmprestimo = entrada.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = entrada.nextInt();

        double taxaJuros = switch (quantidadeParcelas) { // switch expression aqui
            case 1, 2 -> 1.99;
            case 3 -> {
                yield 2.99;
            }
            default -> 3.99;
        };

        double tarifaFixa = valorEmprestimo >= 100 ? 1.50 : 0.0;// use operador ternário aqui
        double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
        double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

        System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
        System.out.printf("Total de juros: R$%.2f%n", totalJuros);
        System.out.printf("Custo total: R$%.2f%n", custoTotal);
    }
}