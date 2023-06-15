package agencia;

import agencia.exception.HotelJaExistenteException;
import agencia.exception.HotelNaoEncontradoException;

import java.util.*;

public class CadastroHotel {

    private final List<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel);
    }

    public List<Hotel> obterTodos() {
        return hoteis;
    }

    public Hotel[] obterTodosComoArray() {
        return hoteis.toArray(new Hotel[0]);
    }

    public void ordenar() {
        Collections.sort(hoteis);
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

    public void ordenarPorPreco() {
//        Collections.sort(hoteis, new PrecoHotelComparator());
        hoteis.sort(new PrecoHotelComparator().reversed());
//                .thenComparing(Comparator.naturalOrder()));
    }

}