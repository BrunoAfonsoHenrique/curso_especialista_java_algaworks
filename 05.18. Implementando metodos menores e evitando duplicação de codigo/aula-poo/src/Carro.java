public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;

    double precoCompra;
    Pessoa proprietario;

    double calcularValorRevenda() {

        int vidaUltilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUltilEmAnos)
                * (vidaUltilEmAnos - calcularTempoDeUsoEmAnos()); // calculo ficticio

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }

    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    void imprimirTempoDeUsoDepreciacao() {
        System.out.printf("Tempo de uso (anos): %d%n", calcularTempoDeUsoEmAnos());
        System.out.println("Valor revenda: R$" + calcularValorRevenda());
    }

    double calcularIpva() {
        return calcularValorRevenda() * 0.04;
    }

}
