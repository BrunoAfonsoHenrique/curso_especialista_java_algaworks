package agencia;

import agencia.exception.HotelJaExistenteException;
import agencia.exception.HotelNaoEncontradoException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CadastroHotel {

    private final LinkedList<Hotel> hoteis = new LinkedList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

//        hoteis.add(0, hotel);
        hoteis.add(hotel);
    }

    public LinkedList<Hotel> obterTodos() {
        return hoteis;
    }


    public void removerPorCidade(String cidade) {
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove(); // remove o ultimo elemento que o hotelIterator.next() retornou
            }

        }
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if (!removido) {
            throw new HotelNaoEncontradoException("Hotel nao encontrado para remocao");
        }
    }

    public void removerTodos() {
        hoteis.clear();
    }

}