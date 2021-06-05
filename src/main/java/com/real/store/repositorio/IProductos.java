package com.real.store.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.real.store.model.productos;



public interface IProductos extends JpaRepository<productos, Integer>{

}
