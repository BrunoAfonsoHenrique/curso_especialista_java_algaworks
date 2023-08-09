public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;

    double precoCompra;
    Pessoa proprietario;

    void calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2022 - anoFabricacao;

        int vidaUltilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUltilEmAnos)
                * (vidaUltilEmAnos - tempoDeUsoEmAnos); // calculo ficticio

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }
        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoEmAnos);
        System.out.printf("Valor de revenda:  R$%6.2f%n", valorRevenda);
    }


}
