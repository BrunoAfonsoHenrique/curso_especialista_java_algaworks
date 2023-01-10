package com.algaworks.seguradora;

import com.algaworks.seguradora.modelo.Caminhao;
import com.algaworks.seguradora.modelo.CarroParticular;
import com.algaworks.seguradora.modelo.ImovelResidencial;
import com.algaworks.seguradora.servico.PropostaSeguroService;

public class Principal {

    public static void main(String[] args) {

        PropostaSeguroService servicoProposta = new PropostaSeguroService();

        CarroParticular carro = new CarroParticular("HR-V", 150_000, 2022);
        Caminhao caminhao = new Caminhao("Actros", 780_000, 2021, 4);
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        servicoProposta.emitir(carro);
        servicoProposta.emitir(caminhao);
        servicoProposta.emitir(imovel);

    }
}
