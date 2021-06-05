package com.real.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "proveedor")
public class proveedores {
	@Id
	@Column(name = "ID_PROVEEDOR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdProveedor;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "CARGO")
	private String cargo;
	@Column(name = "DIRECCION")
	private String direccion;
	@Column(name = "EMAIL")
	private String email;
	
	
	public proveedores() {
		super();
	}
	public proveedores(int idProveedor, String nombre, String cargo, String direccion, String email) {
		super();
		IdProveedor = idProveedor;
		this.nombre = nombre;
		this.cargo = cargo;
		this.direccion = direccion;
		this.email = email;
	}
	public int getIdProveedor() {
		return IdProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		IdProveedor = idProveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
