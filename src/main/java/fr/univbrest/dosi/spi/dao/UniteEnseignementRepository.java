package fr.univbrest.dosi.spi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.spi.entites.Enseignant;
import fr.univbrest.dosi.spi.entites.UniteEnseignement;


@Repository
public interface UniteEnseignementRepository extends CrudRepository<UniteEnseignement, String>{
	
	public List<UniteEnseignement> findByEnseignant (Enseignant enseignant);

}
