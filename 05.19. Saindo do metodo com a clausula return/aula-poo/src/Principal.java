public class Principal {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa();
        eu.nome = "Bruno Afonso";
        eu.cpf = "11122233344";
        eu.anoNascimento = 1996;

        Pessoa voce = new Pessoa();
        voce.nome = "Jeferson";
        voce.cpf = "11122233355";
        voce.anoNascimento = 1938;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 1980;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 0;
        meuCarro.proprietario = eu;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Vermeho";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980_000;
        seuCarro.proprietario = voce;

//        double ipva = meuCarro.calcularIpva();
//        System.out.printf("Valor IPVA: %.2f%n", ipva);

        meuCarro.imprimirTempoDeUsoDepreciacao();
        seuCarro.imprimirTempoDeUsoDepreciacao();


    }
}
