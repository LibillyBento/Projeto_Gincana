package br.edu.ifba.gincana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifba.gincana.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long>  {
	

}
