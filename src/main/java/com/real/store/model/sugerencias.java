package com.real.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "sugerencias")
public class sugerencias {
	@Id
	@Column(name = "COD_SUG")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "MENSAJE")
	private String mensaje;
	@Column(name = "RESPUESTA")
	private String respuesta;
	@Column(name = "FECHA")
	private String fecha;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "DNI_USU")
	private int dni;
	
	
	public sugerencias() {
		super();
	}
	public sugerencias(int codigo, String mensaje, String respuesta, String fecha, String estado, int dni) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.respuesta = respuesta;
		this.fecha = fecha;
		this.estado = estado;
		this.dni = dni;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	


}
