public class Principal {

    public static void main(String[] args) {

        Paciente paciente = new Paciente();
        paciente.altura = 1.82;
        paciente.peso = 175;

        IndiceMassaCorporal imc = paciente.calcularIndiceDeMassaCorporal();

        if (imc.resultado >= 30) {
            System.out.printf("Paciente com altura %.2f e peso de %.2f está com obesidade%n",
                    imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f", imc.resultado);

    }
}
