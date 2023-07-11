package agencia;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionarNovoHotel(String nome, String cidade, double precoDiaria) {
        hoteis.add(new Hotel(nome, cidade, precoDiaria));
    }

    public ArrayList obterTodos() {
        return hoteis;
    }
}
