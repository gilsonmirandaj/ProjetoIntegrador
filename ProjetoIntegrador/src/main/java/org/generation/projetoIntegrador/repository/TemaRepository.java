package org.generation.projetoIntegrador.repository;

import java.util.List;

import org.generation.projetoIntegrador.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByNomeTemaContainingIgnoreCase(String nomeTema);
}
