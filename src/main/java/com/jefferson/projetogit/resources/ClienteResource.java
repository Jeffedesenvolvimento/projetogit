package com.jefferson.projetogit.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jefferson.projetogit.domain.Cliente;
import com.jefferson.projetogit.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping(value = "/buscar/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id) {		
		Cliente categoria = clienteService.buscar(id);		
 		return ResponseEntity.ok().body(categoria);
	}
	
}
