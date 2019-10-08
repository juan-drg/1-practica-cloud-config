package com.jacc.everis.productorest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacc.everis.productorest.model.Producto;
import com.jacc.everis.productorest.repository.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> listar(){
		return productoRepository.findAll();
	}
	
	public Producto insertar(Producto producto) {
		return productoRepository.save(producto);
	}
	
	public Producto buscarId(int idproducto) {
		return productoRepository.findById(idproducto).get();
	}
	
}
