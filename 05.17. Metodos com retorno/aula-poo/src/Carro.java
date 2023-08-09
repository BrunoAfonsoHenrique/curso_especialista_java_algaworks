public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;

    double precoCompra;
    Pessoa proprietario;

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2022 - anoFabricacao;

        int vidaUltilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUltilEmAnos)
                * (vidaUltilEmAnos - tempoDeUsoEmAnos); // calculo ficticio

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }


}
