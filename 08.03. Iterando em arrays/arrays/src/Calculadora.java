public class Calculadora {

    static double calcularMedia(int[] numeros) {
        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }
        return (double) total / numeros.length;
    }

    static double calcularMedia2(int[] numeros) {
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        return (double) total / numeros.length;
    }


}
