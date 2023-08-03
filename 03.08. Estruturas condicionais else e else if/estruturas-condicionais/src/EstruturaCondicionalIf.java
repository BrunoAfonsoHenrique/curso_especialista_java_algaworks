import java.util.Scanner;

public class EstruturaCondicionalIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.printf("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");

        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal.");

        } else if (imc >= 25 && imc < 30) {
            System.out.println("Acima do peso.");

        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I.");

        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau II.");

        } else if (imc >= 40) {
            System.out.println("Obesidade grau III.");

        }

        System.out.println("Fim do programa");

        entrada.close();
    }
}
