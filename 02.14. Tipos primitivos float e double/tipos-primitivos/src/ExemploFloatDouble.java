public class ExemploFloatDouble {

    public static void main(String[] args) {
        double peso = 84.9;
        //double peso = 84.9d; // o "d" é opcional;
        System.out.printf("Peso = %.2f", peso);

        // float taxa = 1_291.93; // Não compila
        float taxa = 1_291.93f;
        System.out.printf("%nTaxa = %.2f", taxa);




    }
}
