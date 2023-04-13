package com.algaworks.crm;

public class Pesquisador {

    public static <T extends Nomeavel> T obterPorNome(T[] item, String nome) { // Extends aqui não é herança
        for (T funcionario : item) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }

        throw new RuntimeException("Funcionario nao encontrado Exception");
    }
}
