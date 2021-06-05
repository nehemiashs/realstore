package com.real.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usuarios")

public class usuario {

	@Id
	@Column(name = "DNI_USU")
	private int dni;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDOS")
	private String apellido;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "CONTRASEÑA")
	private String password;
	@Column(name = "GENERO")
	private String genero;
	@Column(name = "NACIMIENTO")
	private String fech_nacimiento;
	@Column(name = "TELEFONO")
	private int telefono;
	@Column(name="COD_ROL")
	private int codigo;
	@Column(name="ELIMINADO")
	private String eliminado;
	
	
	public usuario() {
		super();
	}
	public usuario(int dni, String nombre, String apellido, String email, String password, String genero,
			String fech_nacimiento, int telefono, int codigo, String eliminado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.genero = genero;
		this.fech_nacimiento = fech_nacimiento;
		this.telefono = telefono;
		this.codigo = codigo;
		this.eliminado = eliminado;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFech_nacimiento() {
		return fech_nacimiento;
	}
	public void setFech_nacimiento(String fech_nacimiento) {
		this.fech_nacimiento = fech_nacimiento;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEliminado() {
		return eliminado;
	}
	public void setEliminado(String eliminado) {
		this.eliminado = eliminado;
	}
	
	
}
