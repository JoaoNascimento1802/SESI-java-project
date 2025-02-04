package com.sesi.projeto.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    Instant momento;

    @ManyToOne
    @JoinColumn(name = "cliente_id") // Nome da coluna no banco de dados
    private User cliente; // Este campo de


    private StatusDoPedido status;

    public Pedido() {
    }

    public Pedido(Long id, Instant momento, StatusDoPedido status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMomento() {
        return momento;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }
}
