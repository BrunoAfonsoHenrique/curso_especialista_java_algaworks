import java.util.Scanner;

public class ControlePesoAeronave {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.print("Peso maximo: ");
        int pesoMaximo = entrada.nextInt();

        System.out.print("Quantidade de passageiros: ");
        int totalPassageiros = entrada.nextInt();

        int pesoTotalPassageiros = 0;

        for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++) {
            System.out.printf("Peso do passageiro %d: ", passageiroAtual);
            int pesoPassageiro = entrada.nextInt();

            pesoTotalPassageiros += pesoPassageiro;
        }
        System.out.printf("Peso maximo da aeronave %d kg%n", pesoMaximo);
        System.out.printf("Peso total passageiros %d kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n",
                pesoTotalPassageiros > pesoMaximo ? "peso excedido": "liberada");
    }
    
}
