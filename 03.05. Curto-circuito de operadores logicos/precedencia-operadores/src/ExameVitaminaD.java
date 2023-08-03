import java.util.Scanner;

public class ExameVitaminaD {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Grupo de risco: ");
        boolean grupoRisco = entrada.nextBoolean();

        System.out.printf("Vitamina D: ");
        double vitaminaD = entrada.nextDouble();

//        boolean vitaminaDNormal = (grupoRisco == false && vitaminaD > 20)
//                || (grupoRisco == true &&  vitaminaD >= 30 && vitaminaD <=60);

        boolean vitaminaDNormal = (!grupoRisco && vitaminaD > 20)
                || (grupoRisco &&  vitaminaD >= 30 && vitaminaD <=60);

        System.out.printf("Vitamina D normal: %b%n", vitaminaDNormal);

        entrada.close();

    }
}
