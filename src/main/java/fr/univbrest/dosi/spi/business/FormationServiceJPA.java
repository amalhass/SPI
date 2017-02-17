package fr.univbrest.dosi.spi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.univbrest.dosi.spi.dao.FormationRepository;
import fr.univbrest.dosi.spi.entites.Formation;
@Component
@Service
@Transactional
public class FormationServiceJPA implements FormationService {

	private FormationRepository formationRepository;

	@Autowired
	FormationServiceJPA(FormationRepository formationRepo) {
		this.formationRepository = formationRepo;
	}

	@Override
	public List<Formation> findAll() {
		return (List<Formation>) formationRepository.findAll();

	}

	@Override
	public Formation addFormation(Formation formation) {
		return formationRepository.save(formation);

	}

	@Override
	public void deleteFormation(String codeFormation) {
		Formation formation = formationRepository.findByCodeFormation(codeFormation);
		System.out.print(formation.getCodeFormation());
		formationRepository.delete(formation);
	}

	@Override
	public Formation findOneFormation(String codeFormation) {

		return formationRepository.findOne(codeFormation);
	}

	@Override
	public Formation updateFormation(Formation formation) {
		
		return formationRepository.save(formation);

	}

}
