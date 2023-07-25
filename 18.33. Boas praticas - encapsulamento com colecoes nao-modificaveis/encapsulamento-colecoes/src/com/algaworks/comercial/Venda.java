package com.algaworks.comercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

    private final Cliente cliente;
    private final List<ItemVenda> itens = new ArrayList<>();
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return Collections.unmodifiableList(itens); // Visão -> somente leitura
    }


    public double getValorTotal() {
        return valorTotal;
    }



    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void adicionarItem(ItemVenda item) {
        if (excedeLimiteCompra(item)) {
            throw new LimiteDeCompraExcedidoException(String.format("LIMITE ATUAL: %.2f", cliente.getLimiteCompras()));
        }
        valorTotal += item.getValor();
        itens.add(item);
    }

    private boolean excedeLimiteCompra(ItemVenda item) {
        return valorTotal + item.getValor() > getCliente().getLimiteCompras();
    }
}