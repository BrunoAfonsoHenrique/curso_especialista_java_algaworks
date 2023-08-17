public class Principal {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double valor = calculadora.calculatMedia(7, 9, 3, 5, 1, 2);
        System.out.printf("Media = %2f%n", valor);
    }
}