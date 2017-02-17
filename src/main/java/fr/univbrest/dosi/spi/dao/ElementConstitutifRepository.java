package fr.univbrest.dosi.spi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.spi.entites.ElementConstitutif;
import fr.univbrest.dosi.spi.entites.UniteEnseignement;


@Repository
public interface ElementConstitutifRepository extends CrudRepository<ElementConstitutif, String>{

	public List<ElementConstitutif> findByUniteEnseignement(UniteEnseignement uniteEnseignement);
}
