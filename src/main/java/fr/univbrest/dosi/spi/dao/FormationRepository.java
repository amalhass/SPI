package fr.univbrest.dosi.spi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.spi.entites.Formation;


@Repository
public interface FormationRepository extends CrudRepository<Formation, String> {

	public Formation findByCodeFormation(String codeFormation);
}
