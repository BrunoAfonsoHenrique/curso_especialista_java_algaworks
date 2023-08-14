public class Principal {

    public static void main(String[] args) {
         double areaQuadrado = CalcularAreaUtil.calcularAreaQuadrado(5.2);
         double areaCirculo = CalcularAreaUtil.calcularAreaCirculo(10.5);

        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }
}
