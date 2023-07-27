import agencia.CadastroHotel;
import agencia.Hotel;

import java.util.ArrayList;
import java.util.ListIterator;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionarNovoHotel("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionarNovoHotel("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionarNovoHotel("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionarNovoHotel("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionarNovoHotel("Mercure", "Uberlândia/MG", 400);

        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        ListIterator<Hotel> hotelIterator = hoteis.listIterator(hoteis.size());
        while (hotelIterator.hasPrevious()) {
            Hotel hotel = hotelIterator.previous();
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

//    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
//        Iterator<Hotel> hotelIterator = hoteis.iterator();
//        while (hotelIterator.hasNext()) {
//            Hotel hotel = hotelIterator.next();
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
//                    hotel.getCidade(), hotel.getPrecoDiaria());
//        }
//    }
}
