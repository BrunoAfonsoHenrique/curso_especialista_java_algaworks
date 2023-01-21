package com.algaworks.tempo;

public class CalculadoraTempo  {

    public static final int SEGUNDOS_POR_MINUTO = 60;
    public static final int SEGUNDOS_POR_HORA = 3600;

    public static double converterSegundosEmHoras(int segundos) {
        return (double) segundos / SEGUNDOS_POR_HORA;
    }

    public static double converterSegundosEmMinutos(int segundos) {
        return (double) segundos / SEGUNDOS_POR_MINUTO;
    }

}
