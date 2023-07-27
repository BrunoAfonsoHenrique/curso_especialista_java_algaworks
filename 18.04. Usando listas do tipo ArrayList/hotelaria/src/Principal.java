import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionarNovoHotel("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionarNovoHotel("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionarNovoHotel("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionarNovoHotel("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionarNovoHotel("Mercure", "Uberlândia/MG", 400);

      //  System.out.println(cadastro.obterTodos());

        Hotel hotel = (Hotel) cadastro.obterTodos().get(2);
        System.out.println(hotel);
    }
}
