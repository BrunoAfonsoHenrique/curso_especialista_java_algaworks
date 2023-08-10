public class CalculadoraImc {

    IndiceMassaCorporal calcular(Paciente paciente) {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = paciente.peso / Math.pow(paciente.altura, 2);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;
    }
}
