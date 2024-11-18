package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
