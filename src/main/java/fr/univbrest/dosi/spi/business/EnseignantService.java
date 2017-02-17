package fr.univbrest.dosi.spi.business;

import java.util.List;

import fr.univbrest.dosi.spi.entites.Enseignant;

public interface EnseignantService {

	public List<Enseignant> findAll();
	public Enseignant findById(long id);
	public Enseignant addEnseignant(Enseignant enseignant);
	public void deleteEnseignant(long noEnseignant);
	public Enseignant updateEnseignant(Enseignant enseignant);
}
