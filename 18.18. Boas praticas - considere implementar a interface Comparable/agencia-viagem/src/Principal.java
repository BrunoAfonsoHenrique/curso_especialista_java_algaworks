import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionarNovoHotel("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionarNovoHotel("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionarNovoHotel("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionarNovoHotel("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionarNovoHotel("Mercure", "Uberlândia/MG", 400);

        Hotel[] hoteis = cadastro.obterTodosComoArray();
        System.out.println(Arrays.toString(hoteis));

//        List<Hotel> hoteis = cadastro.obterTodos();
//        imprimirHoteis(hoteis);
    }


    private static void imprimirHoteis(List<Hotel> hoteis) {

        for (Hotel hotel : hoteis) {
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }

    }
}
