package com.real.store.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.real.store.repositorio.IListarProveedores;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping()
public class PasarelaPagoController {
	
	@Autowired
	private IListarProveedores Cuenta;
	
	@GetMapping("/validarpago/{nombre}/{numero}/{expiracion}/{codigo}")
	public List<Map<String,Object>> ValidarPago(@PathVariable(value="nombre") String nombre,
			@PathVariable(value="numero") String numero,
			@PathVariable(value="expiracion") String expiracion,
			@PathVariable(value="codigo") String codigo) {
		
		List<Map<String,Object>> res = this.Cuenta.ValidarPago(nombre, numero, expiracion, codigo);
		return res;
	}
	
	

}
