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
}
