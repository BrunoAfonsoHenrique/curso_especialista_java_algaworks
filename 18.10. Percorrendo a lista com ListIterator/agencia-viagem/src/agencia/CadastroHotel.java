package agencia;

import java.util.ArrayList;
import java.util.Iterator;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionarNovoHotel(String nome, String cidade, double precoDiaria)  {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("HOTEL JA FOI ADICIONADO");
        }

        hoteis.add(hotel);

    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove();
            }
        }
    }




//        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();
//
//        for (int i = 0; i < hoteis.size(); i++) {
//            Hotel hotel = hoteis.get(i);
//            if (hotel.getCidade().equals(cidade)) {
//                hoteisParaRemocao.add(hotel);
//
//                i--;
//            }
//        }
//        hoteis.removeAll(hoteisParaRemocao);
//    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);
        if (!removido) {
            throw new HotelJaExistenteException("HOTEL NAO ENCONTRADO PARA REMOCAO");
        }
    }

    public void removerTodos() {
        hoteis.clear();;
    }
}
