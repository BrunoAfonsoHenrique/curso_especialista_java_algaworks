public class Principal {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

//        String[] emailCobranca = {"Joao@gmail.com", "maria@gmail.com"};
//        servicoDeCobranca.pagar(fatura, emailCobranca);

//        servicoDeCobranca.pagar(fatura,
//                new String[]{"Joao@gmail.com", "maria@gmail.com"});

//        servicoDeCobranca.pagar(fatura, new String[0]); // Array vazio

//        servicoDeCobranca.pagar(fatura, new String[]{}); // mesma coisa que a linha acima

//        servicoDeCobranca.pagar(fatura, "Joao@gmail.com", "maria@gmail.com");

        servicoDeCobranca.pagar(fatura, "maria@gmail.com", "joao@gmail.com");
    }
}
