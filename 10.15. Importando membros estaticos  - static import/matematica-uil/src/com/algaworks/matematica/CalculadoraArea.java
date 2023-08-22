package com.algaworks.matematica;

public class CalculadoraArea {

    public static final double PI = Math.PI;

    public static  double calcularAreaQuadrado(double mediaDoLado) {
        return mediaDoLado * mediaDoLado;
    }

    public static  double calcularAreaCirculo(double raio) {
        return raio * raio * CalculadoraArea.PI;
    }
}
