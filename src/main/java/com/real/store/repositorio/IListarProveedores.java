package com.real.store.repositorio;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.real.store.model.proveedores;



public interface IListarProveedores extends JpaRepository<proveedores, Integer> {
	@Query(value="{call VALIDARPAGO(:nombre, :numero, :expiracion, :codigo)}", nativeQuery = true)
	List<Map<String,Object>> ValidarPago(@Param("nombre") String nombre, 
											@Param("numero") String numero,
											@Param("expiracion") String expiracion,
											@Param("codigo") String codigo);
}
