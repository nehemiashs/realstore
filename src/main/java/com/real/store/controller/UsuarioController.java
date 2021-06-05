package com.real.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.real.store.model.usuario;
import com.real.store.repositorio.IUsuario;






@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping()
public class UsuarioController {
	@Autowired
	private IUsuario Usuario;
	
	@PostMapping("/registrarusuario")
	public usuario registrar(@RequestBody usuario user) {
		return this.Usuario.save(user);
	}
	
	@GetMapping("/listarusuarios")
	public List<usuario> ListarUsuariosGeneral() {
		return this.Usuario.findAll();
	}
	
	@GetMapping("/listarusuario/{dni}")
	public List<usuario> ListarUsuario(@PathVariable(value="dni") int dni) {
		return this.Usuario.ListarUsuario(dni);
	}

	@PutMapping("/actualizardatos")
	public usuario ActualizarUsuario(@RequestBody usuario usu) {
		return this.Usuario.save(usu);
	}
	
	@DeleteMapping("/eliminarusuario/{dni}")
	public usuario EliminarUsuario(@PathVariable(value="dni") int dni) {
		return this.Usuario.EliminarUsuario(dni);
	}
	
	@PutMapping("/asignarrol")
	public usuario AsignarRol(@RequestBody usuario usu) {
		return this.Usuario.save(usu);
	}
	
}
