import java.util.Objects;

public class Calculadora {

    public double calculatMedia(double numeroUm, double numeroDois, double... numerosAdicionais) {
        double soma = 0;

        for (double numeros : numerosAdicionais) {
            soma += numeros;
        }

        double quantidadeDeNumerosnoArray = numerosAdicionais.length + 2;
        double media = (numeroUm + numeroDois + soma) / quantidadeDeNumerosnoArray;

        return media;
    }
}
