package com.jacc.everis.productorest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacc.everis.productorest.model.Producto;
import com.jacc.everis.productorest.service.ProductoService;

@RestController
@RequestMapping("productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public List<Producto> listar(){
		return productoService.listar();
	}
	
	@GetMapping("/{id}")
	public Producto buscarId(@PathVariable int idproducto) {
		return productoService.buscarId(idproducto);
	}
	
	@PostMapping("/")
	public Producto insertar(@RequestBody Producto producto) {
		return productoService.insertar(producto);
	}
}
