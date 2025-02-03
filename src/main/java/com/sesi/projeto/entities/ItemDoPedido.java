package com.sesi.projeto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pedido")
public class ItemDoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int quantidade;

    private Double preco;

    public ItemDoPedido() {
    }

    public ItemDoPedido(int quantidade, Double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
