package br.com.Filmes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.Filmes.Diretor;

@Transactional
public interface DiretorRespository extends JpaRepository<Diretor, Long>{

	
		
}
