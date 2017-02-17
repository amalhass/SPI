package fr.univbrest.dosi.spi.business;

import java.util.List;

import fr.univbrest.dosi.spi.entites.Formation;

public interface FormationService {
	
	public List<Formation> findAll();

	public Formation addFormation(Formation formation);

	public void deleteFormation(String codeFormation);

	public Formation findOneFormation(String codeFormation);
	
	public Formation updateFormation(Formation formation);
}
