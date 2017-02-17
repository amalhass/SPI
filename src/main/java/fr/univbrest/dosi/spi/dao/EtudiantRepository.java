package fr.univbrest.dosi.spi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.spi.entites.Etudiant;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, String>{
	
	 public List<Etudiant> findByNom (String nom);

}
