package com.gamesdpunk.games.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesdpunk.games.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByEstiloContainingIgnoreCase(String estilo);
}
