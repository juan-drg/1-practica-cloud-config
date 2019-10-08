package com.jacc.everis.productorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacc.everis.productorest.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
