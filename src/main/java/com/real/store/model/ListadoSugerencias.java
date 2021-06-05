package com.real.store.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()

public class ListadoSugerencias {
	@Id
	private int cod_sug;
	private String nombre;
	private String apellidos;
	private String email;
	private int telefono;
	private String mensaje;
	private String fecha;
	private String respuesta;
	private String estado;
	private String dni_usu;
	
	
	
	public ListadoSugerencias() {
		super();
	}
	public ListadoSugerencias(int cod_sug, String nombre, String apellidos, String email, int telefono, String mensaje,
			String fecha, String respuesta, String estado, String dni_usu) {
		super();
		this.cod_sug = cod_sug;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.mensaje = mensaje;
		this.fecha = fecha;
		this.respuesta = respuesta;
		this.estado = estado;
		this.dni_usu = dni_usu;
	}
	public int getCod_sug() {
		return cod_sug;
	}
	public void setCod_sug(int cod_sug) {
		this.cod_sug = cod_sug;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDni_usu() {
		return dni_usu;
	}
	public void setDni_usu(String dni_usu) {
		this.dni_usu = dni_usu;
	}
	
	

	
}
