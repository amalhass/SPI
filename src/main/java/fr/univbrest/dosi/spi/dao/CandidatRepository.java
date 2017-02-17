package fr.univbrest.dosi.spi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import fr.univbrest.dosi.spi.entites.Candidat;

@Repository
public interface CandidatRepository extends CrudRepository<Candidat, String> {
	
	 public List<Candidat> findByNom (String nom);
	 List<Candidat> findByUniversiteOrigine(String universiteOrigine);
}
