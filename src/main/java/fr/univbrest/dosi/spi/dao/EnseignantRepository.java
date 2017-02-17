package fr.univbrest.dosi.spi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.spi.entites.Enseignant;


@Repository
public interface EnseignantRepository extends CrudRepository<Enseignant, Long>{
	
	public List<Enseignant> findByVille(String ville);

}
