import com.algaworks.matematica.CalculadoraArea;

public class Principal {

    public static void main(String[] args) {

//        CalculadoraArea calculadoraArea = new CalculadoraArea();

        double areaQuadrado = CalculadoraArea.calcularAreaQuadrado(5.2);
        double areaCirculo = CalculadoraArea.calcularAreaCirculo(10.5);

        System.out.printf("PI: %.2f%n", CalculadoraArea.PI);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }

}