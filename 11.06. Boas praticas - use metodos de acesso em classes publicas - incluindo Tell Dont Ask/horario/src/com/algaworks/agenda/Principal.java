package com.algaworks.agenda;

public class Principal {

    public static void main(String[] args) {

        Horario horario = new Horario(10, 55);
        System.out.println(horario.formatar());
    }
}
