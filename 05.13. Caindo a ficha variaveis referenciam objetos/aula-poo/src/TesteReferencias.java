public class TesteReferencias {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Joao";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "HR-V";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "X-6";

        meuCarro.proprietario = pessoa1;
        seuCarro.proprietario = pessoa1;

        meuCarro.proprietario.nome = "Sebastiao";

        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);

//        meuCarro.proprietario.nome = "Maria";
//        System.out.println(pessoa1.nome);

//        pessoa1.nome = "Maria";
//        System.out.println(meuCarro.proprietario.nome);

    }
}
