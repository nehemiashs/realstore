package com.real.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "productos")
public class productos {

	@Id
	@Column(name = "COD_PROD")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "IMAGE")
	private String image;
	@Column(name = "STOCK")
	private int stock;
	@Column(name = "PRECIO")
	private String precio;
	@Column(name = "COD_CATE")
	private int cod_categoria;
	@Column(name = "ID_PROVEEDOR")
	private String id_proveedor;
	
	
	
	public productos() {
		super();
	}
	public productos(int codigo, String nombre, String descripcion, String image, int stock, String precio,
			int cod_categoria, String id_proveedor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.image = image;
		this.stock = stock;
		this.precio = precio;
		this.cod_categoria = cod_categoria;
		this.id_proveedor = id_proveedor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public int getCod_categoria() {
		return cod_categoria;
	}
	public void setCod_categoria(int cod_categoria) {
		this.cod_categoria = cod_categoria;
	}
	public String getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(String id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	

	

}
