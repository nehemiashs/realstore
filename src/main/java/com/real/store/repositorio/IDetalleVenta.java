package com.real.store.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.real.store.model.DetalleVenta;



public interface IDetalleVenta extends JpaRepository<DetalleVenta, Integer>{

}
