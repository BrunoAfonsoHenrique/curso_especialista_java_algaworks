import java.io.PipedWriter;

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
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = eu;
//        meuCarro.proprietario = new Pessoa();
//        meuCarro.proprietario.nome = "Bruno Afonso";
//        meuCarro.proprietario.cpf = "11122233344";
//        meuCarro.proprietario.anoNascimento = 1996;
        System.out.printf("Meu carro%n");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietario: %s%n", meuCarro.proprietario.nome);

        System.out.printf("----------------------%n");

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Vermeho";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.proprietario = voce;
        System.out.printf("Seu carro%n");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietario: %s%n", seuCarro.proprietario.nome);

    }
}
