import com.algaworks.matematica.CalculadoraArea;

import static com.algaworks.matematica.CalculadoraArea.*;
import static com.algaworks.matematica.CalculadoraArea.calcularAreaCirculo;
import static com.algaworks.matematica.CalculadoraArea.calcularAreaQuadrado;

public class Principal {

    public static void main(String[] args) {
        double areaQuadrado = calcularAreaQuadrado(5.2);
        double areaCirculo = calcularAreaCirculo(10.5);

        System.out.printf("PI: %.2f%n", PI); // Atallho no inteliJ: ALT + ENTER
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }
}
