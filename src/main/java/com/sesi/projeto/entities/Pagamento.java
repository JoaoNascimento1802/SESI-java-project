package com.sesi.projeto.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_pagamentos")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    Instant momento;

    public Pagamento() {
    }

    public Pagamento(long id, Instant momento) {
        this.id = id;
        this.momento = momento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getMomento() {
        return momento;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }
}
