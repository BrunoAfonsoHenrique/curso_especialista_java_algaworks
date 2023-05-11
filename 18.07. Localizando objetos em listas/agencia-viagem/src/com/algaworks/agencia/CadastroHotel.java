package com.algaworks.agencia;

import com.algaworks.agencia.exception.HotelJaExistenteException;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();


    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);
        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já esta adicionado a lista de hotéis");
        }

        hoteis.add(hotel);
    }

    public ArrayList obterTodos() {
        return hoteis;
    }

}
