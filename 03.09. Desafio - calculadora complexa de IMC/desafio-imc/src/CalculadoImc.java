import java.util.Scanner;

public class CalculadoImc {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.printf("Altura: ");
        double altura = entrada.nextDouble();

        System.out.printf("Genero (M ou F): ");
        char genero = entrada.next().toUpperCase().charAt(0);

        entrada.close();

        double imc = peso / (Math.pow(altura, 2));

        if ((genero == 'F' && imc < 19.1) || (genero == 'M' && imc < 20.7)) {
            System.out.println("Abaixo do peso");
        } else if ((genero == 'F' && imc <= 25.8) || (genero == 'M' && imc <= 26.4)) {
            System.out.println("No peso ideal");
        } else if ((genero == 'F' && imc <= 27.4) || (genero == 'M' && imc <= 27.8)) {
            System.out.println("Um pouco acima do peso");
        } else if ((genero == 'F' && imc <= 32.3) || (genero == 'M' && imc <= 31.1)) {
            System.out.println("Acima do peso ideal");
        } else {
            System.out.println("Obeso");
        }
    }
}
