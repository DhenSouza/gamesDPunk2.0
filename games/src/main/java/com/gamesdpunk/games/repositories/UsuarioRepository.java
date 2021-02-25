package com.gamesdpunk.games.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesdpunk.games.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}
