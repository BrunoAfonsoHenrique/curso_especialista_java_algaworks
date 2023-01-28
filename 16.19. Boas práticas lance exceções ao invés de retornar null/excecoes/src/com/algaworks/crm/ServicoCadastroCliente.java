package com.algaworks.crm;

public class ServicoCadastroCliente {

    public Cliente cadastrar(String nome, int idade) throws MenorDeIdadeException {
        if (idade < 18) {
            throw new MenorDeIdadeException("Não pode cadastrar menor de idade");
        }


        // TODO faz cadastro aqui

        return new Cliente(nome, idade);
    }
}
