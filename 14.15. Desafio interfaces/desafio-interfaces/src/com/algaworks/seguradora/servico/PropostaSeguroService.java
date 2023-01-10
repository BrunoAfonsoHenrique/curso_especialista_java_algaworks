package com.algaworks.seguradora.servico;

import com.algaworks.seguradora.modelo.BemSeguravel;

public class PropostaSeguroService {

    public void emitir(BemSeguravel bemSeguravel) {
        System.out.printf("Premio: %.2f", bemSeguravel.calcularValorPremio());
    }
}
