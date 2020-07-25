package com.jefferson.projetogit.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jefferson.projetogit.domain.Cliente;
import com.jefferson.projetogit.repository.ClienteRepository;
import com.jefferson.projetogit.services.exceptions.ObjectNotFoundException;


@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository categoriaRepository;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> categoria = categoriaRepository.findById(id);
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
