package com.real.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "categoria_producto")
public class categorias {
	@Id
	@Column(name = "COD_CATE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CodigoCategoria;
	@Column(name = "NOM_CATE")
	private String NombreCategoria;
	
	public int getCodigoCategoria() {
		return CodigoCategoria;
	}
	public void setCodigoCategoria(int codigoCategoria) {
		CodigoCategoria = codigoCategoria;
	}
	public String getNombreCategoria() {
		return NombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		NombreCategoria = nombreCategoria;
	}
}
