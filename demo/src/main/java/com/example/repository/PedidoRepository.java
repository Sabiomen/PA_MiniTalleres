package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}