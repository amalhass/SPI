package fr.univbrest.dosi.spi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.univbrest.dosi.spi.dao.EnseignantRepository;
import fr.univbrest.dosi.spi.entites.Enseignant;
@Component
@Service
@Transactional
public class EnseignantServiceJPA implements EnseignantService{

	private EnseignantRepository enseignantRepository;
	
	@Autowired

	EnseignantServiceJPA(EnseignantRepository enseignantRepo){
		this.enseignantRepository=enseignantRepo;
	}
	@Override
	public List<Enseignant> findAll() {
	
		return (List<Enseignant>) enseignantRepository.findAll();
	}
	@Override
	public Enseignant findById(long id) {
		
		return enseignantRepository.findOne(id);
	}
	@Override
	public Enseignant addEnseignant(Enseignant enseignant) {
		
		return enseignantRepository.save(enseignant);
	}
	@Override
	public void deleteEnseignant(long noEnseignant) {
		Enseignant enseignant=enseignantRepository.findOne(noEnseignant);
		enseignantRepository.delete(enseignant);
		
	}
	@Override
	public Enseignant updateEnseignant(Enseignant enseignant) {
		return enseignantRepository.save(enseignant);
	}

	
}
