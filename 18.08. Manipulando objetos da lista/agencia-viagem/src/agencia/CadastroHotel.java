package agencia;

import java.util.ArrayList;

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
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if (hotel.getCidade().equals(cidade)) {
                hoteis.remove(i);
                i--;
            }
        }
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);
        if (!removido) {
            throw new HotelJaExistenteException("HOTEL NAO ENCONTRADO PARA REMOCAO");
        }
    }
}
