package com.algaworks.agencia;

import java.util.*;

public class CadastroPacoteViagem {

    List<PacoteViagem> listaPacoteViagem = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem pacote = new PacoteViagem(descricao, precoDiaria);

        if (listaPacoteViagem.contains(pacote)) {
            throw new PacoteDeViagensJaExistenteException("JA EXISTE O PACOTE CADASTRADO NA LISTA DE PACOTES");
        }
        listaPacoteViagem.add(new PacoteViagem(descricao, precoDiaria));

    }

    public List<PacoteViagem> obterTodos() {

        return listaPacoteViagem;
    }

    public void ordenar() {
        Collections.sort(listaPacoteViagem);
    }

    public void ordenarPorPrecoDecrescente() {
        listaPacoteViagem.sort(new OrdenarPorPrecoDecrescente().reversed());
    }

    public void removerPorDescricao(String descricao) {
        Iterator<PacoteViagem> pacoteViagemIterator = listaPacoteViagem.iterator();
        boolean removido = false;
        while (pacoteViagemIterator.hasNext()) {
            PacoteViagem pacoteViagem = pacoteViagemIterator.next();
            if (pacoteViagem.getDescricao().equals(descricao)) {
                pacoteViagemIterator.remove();
                removido = true;
            }
        }
        if(!removido) {
            throw new PacoteDeViagemNaoEncontradoException("PACOTE DE VIAJENS INEXISTENTE");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacoteViagem : listaPacoteViagem) {
            if (pacoteViagem.getDescricao().equals(descricao)) {
                return pacoteViagem;
            }
        }

        throw new DescricaoNaoLocalizadaException("DESCRICAO NAO LOCALIZADA");
    }

}