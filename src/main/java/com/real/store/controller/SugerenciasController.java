package com.real.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.real.store.model.ListadoSugerencias;
import com.real.store.model.sugerencias;
import com.real.store.repositorio.IListadoSugerencia;
import com.real.store.repositorio.ISugerencia;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping()
public class SugerenciasController {
	
	@Autowired
	private ISugerencia Sugerencia;
	@Autowired
	private IListadoSugerencia ListadoSugerencia;
	
	@PostMapping("/registrarsugerencias")
	public sugerencias RegistrarSugerencia(@RequestBody sugerencias sug) {
		return this.Sugerencia.save(sug);
	}
	
	@GetMapping("/listarsugerencias/{dni}")
	public List<sugerencias> lista(@PathVariable(value="dni") int dni) {
		return this.Sugerencia.ListarSugerencias(dni);
	}
	
	@GetMapping("/listarsugerenciasgeneral")
	public List<ListadoSugerencias> listageneral() {
		return this.ListadoSugerencia.ListarSugerenciasGeneral();
	}
	
	@PutMapping("/actualizarsugerencia")
	public sugerencias ActualizarSugerencia(@RequestBody sugerencias sug) {	
		return this.Sugerencia.save(sug);
	}
	
}
