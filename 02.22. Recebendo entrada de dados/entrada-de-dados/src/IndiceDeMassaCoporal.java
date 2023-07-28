import java.util.Scanner;

public class IndiceDeMassaCoporal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite seu peso: ");
        int peso = entrada.nextInt();

        System.out.printf("Digite sua altura: ");
        double altura = entrada.nextDouble();

        entrada.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        double imc = (peso / (Math.pow(altura, 2)));

        System.out.printf("IMC de %s: %.2f%n", nome, imc);

        entrada.close();

    }
}
