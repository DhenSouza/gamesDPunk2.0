package com.gamesdpunk.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamesdpunk.games.model.Categoria;
import com.gamesdpunk.games.repositories.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaControlle {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAllCategoria(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> findByIdCategoria(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/estilo/{estilo}")
	public ResponseEntity<List<Categoria>> findByDescricao(@PathVariable String estilo){
		return ResponseEntity.ok(repository.findAllByEstiloContainingIgnoreCase(estilo));
	}
	
	
}
