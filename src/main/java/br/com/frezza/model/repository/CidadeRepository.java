package br.com.frezza.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.frezza.model.bean.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

	public List<Cidade>findByNomeStartingWith (String l);
	
	public Cidade findByLatitudeAndLongitude (String latitude, String longitude);
}
