package com.algaworks.agencia;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class CadastroHotel {

    private final Vector<Hotel> hoteis = new Vector<>();

    public void adicionarNovoHotel(String nome, String cidade, double precoDiaria)  {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("HOTEL JA FOI ADICIONADO");
        }

        hoteis.add(hotel);

    }

    public Vector<Hotel> obterTodos() {
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