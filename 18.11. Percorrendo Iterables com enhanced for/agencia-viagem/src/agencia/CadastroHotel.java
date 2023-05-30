package agencia;

import agencia.exception.HotelJaExistenteException;
import agencia.exception.HotelNaoEncontradoException;


import java.util.ArrayList;
import java.util.Iterator;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

//        hoteis.add(0, hotel);
        hoteis.add(hotel);
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

//    public void removerPorCidade(String cidade) {
//        for (int i = 0; i < hoteis.size(); i++) {
//           Hotel hotel  = hoteis.get(i);
//           if (hotel.getCidade().equals(cidade)) {
//               hoteis.remove(i);
//               i--;
//           }
//        }
//    }

//    public void removerPorCidade(String cidade) {
//        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();
//        for (int i = 0; i < hoteis.size(); i++) {
//            Hotel hotel  = hoteis.get(i);
//            if (hotel.getCidade().equals(cidade)) {
//                hoteisParaRemocao.add(hotel);
//            }
//        }
//
//        hoteis.removeAll(hoteisParaRemocao);
//    }

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