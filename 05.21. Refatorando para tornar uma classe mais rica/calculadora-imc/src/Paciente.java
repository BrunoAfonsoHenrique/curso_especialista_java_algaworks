public class Paciente {

    double peso;
    double altura;

    IndiceMassaCorporal calcularIndiceDeMassaCorporal() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / Math.pow(altura, 2);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
