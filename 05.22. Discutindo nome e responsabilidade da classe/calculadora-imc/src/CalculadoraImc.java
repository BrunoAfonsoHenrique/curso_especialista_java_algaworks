public class CalculadoraImc {

    double peso;
    double altura;
    IndiceMassaCorporal calcular() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / Math.pow(altura, 2);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
