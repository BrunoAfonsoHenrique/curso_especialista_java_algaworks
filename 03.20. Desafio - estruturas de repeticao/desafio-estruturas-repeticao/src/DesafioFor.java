import java.util.Scanner;

public class DesafioFor {

    private static int numero;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int somaNumeros = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o numero: ");
            numero = entrada.nextInt();

            while (numero % 2 != 0) {
                System.out.printf("Numero %d é invalido. Digite apenas numeros pares.%n", numero);

                System.out.print("Digite o numero : ");
                numero = entrada.nextInt();
            }
            somaNumeros += numero;
        }

        System.out.printf("Soma dos numeros: %d%n", somaNumeros);
        System.out.printf("Soma dos numeros: %d%n", somaNumeros);

        /*
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número par: ");
            int numero2 = entrada.nextInt();

            if (numero2 % 2 == 0) {
                somaNumeros += numero2;
            } else {
                i--;
            }
        }

        System.out.printf("Soma dos numeros: %d%n", somaNumeros);

         */
    }
}
