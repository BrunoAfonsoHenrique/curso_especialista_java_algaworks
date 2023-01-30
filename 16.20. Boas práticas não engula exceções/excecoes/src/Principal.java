public class Principal {

    public static void main(String[] args) {

        ServicoCadastroAnuncio servicoCadastroAnuncio = new ServicoCadastroAnuncio();
        servicoCadastroAnuncio.cadastrar("123", "teste");

        System.out.println("Anuncio cadastrado");

    }
}