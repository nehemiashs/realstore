package com.real.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "VENTAS")
public class ventas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VENTAS")
	private int idventas;
	@Column(name = "FECHA_VENTA")
	private String fecha;
	@Column(name = "DNI_USU")
	private String dni;
	@Column(name = "COD_CARD")
	private String codigo;
	
	public ventas() {
		super();
	}
	public ventas(int idventas, String fecha, String dni, String codigo) {
		super();
		this.idventas = idventas;
		this.fecha = fecha;
		this.dni = dni;
		this.codigo = codigo;
	}
	public int getIdventas() {
		return idventas;
	}
	public void setIdventas(int idventas) {
		this.idventas = idventas;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
}
