package com.jefferson.projetogit.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jefferson.projetogit.domain.Categoria;
import com.jefferson.projetogit.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	CategoriaService categoriaService;
	
	@GetMapping(value = "/buscar/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id) {		
		Categoria categoria = categoriaService.buscar(id);		
 		return ResponseEntity.ok().body(categoria);
	}
	
}
