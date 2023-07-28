import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.printf("Valor por hora: ");
        double valor = entrada.nextDouble();

        System.out.printf("Horas trabalhadas: ");
        int horas = entrada.nextInt();

        System.out.printf("Valor de descontos: ");
        double valorDescontos = entrada.nextDouble();

        entrada.close();

        double totalHoras = valor * horas;
        double totalDevido = totalHoras - valorDescontos;

        System.out.printf("Folha de pagamento: %s%n " +
                        "%d horas x R$%.2f = R$%.2f%n " +
                        "Descontos: R$%.2f%n " + "Total devido: R$%.2f",
                nome, horas, valor, totalHoras,valorDescontos, totalDevido);

    }
}
