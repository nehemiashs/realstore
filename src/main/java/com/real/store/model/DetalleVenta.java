package com.real.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "DETALLE_VENTA")
public class DetalleVenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DETALLE")
	private int iddetalle;
	@Column(name = "CANTIDAD")
	private String cantidad;
	@Column(name = "DESCUENTOS")
	private String descuentos;
	@Column(name = "COD_PROD")
	private String codcard;
	@Column(name = "ID_VENTAS")
	private String idventas;
	
	
	public DetalleVenta() {
		super();
	}
	public DetalleVenta(int iddetalle, String cantidad, String descuentos, String codcard, String idventas) {
		super();
		this.iddetalle = iddetalle;
		this.cantidad = cantidad;
		this.descuentos = descuentos;
		this.codcard = codcard;
		this.idventas = idventas;
	}
	public int getIddetalle() {
		return iddetalle;
	}
	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getDescuentos() {
		return descuentos;
	}
	public void setDescuentos(String descuentos) {
		this.descuentos = descuentos;
	}
	public String getCodcard() {
		return codcard;
	}
	public void setCodcard(String codcard) {
		this.codcard = codcard;
	}
	public String getIdventas() {
		return idventas;
	}
	public void setIdventas(String idventas) {
		this.idventas = idventas;
	}
	
	
	
}
