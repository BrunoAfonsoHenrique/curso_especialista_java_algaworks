package com.algaworks.estruturadedados;

import java.util.Arrays;

public class Fila<E> implements Colecao<E> {

    private E[] itens;

    public Fila() {
        itens = (E[]) new Object[0];
    }

    public void colocar(E item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length-1] = item;
    }

    public E retirar() {
        if (itens.length == 0) {
            throw new ColecaoVaziaException("Fila sem itens");
        }

        E item = itens[0];
        itens = Arrays.copyOfRange(itens, 1, itens.length);

        return item;
    }

}