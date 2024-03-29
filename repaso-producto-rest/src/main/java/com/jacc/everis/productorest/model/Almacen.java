package com.jacc.everis.productorest.model;
// Generated 7/10/2019 10:56:26 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Almacen generated by hbm2java
 */
@Entity
@Table(name = "almacen", catalog = "productoventa")
public class Almacen implements java.io.Serializable {

	private Integer idalmacen;
	private Producto producto;
	private Integer cantidad;
	private Date fechahora;

	public Almacen() {
	}

	public Almacen(Producto producto) {
		this.producto = producto;
	}

	public Almacen(Producto producto, Integer cantidad, Date fechahora) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.fechahora = fechahora;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idalmacen", unique = true, nullable = false)
	public Integer getIdalmacen() {
		return this.idalmacen;
	}

	public void setIdalmacen(Integer idalmacen) {
		this.idalmacen = idalmacen;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Column(name = "cantidad")
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechahora", length = 19)
	public Date getFechahora() {
		return this.fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
	}

}
