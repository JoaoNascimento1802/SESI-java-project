package com.sesi.projeto.dto;

import com.sesi.projeto.entities.StatusDoPedido;

import java.time.Instant;

public record PedidoDTO(Instant moment, StatusDoPedido status) {
}
