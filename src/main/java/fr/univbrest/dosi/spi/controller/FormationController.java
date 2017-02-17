package fr.univbrest.dosi.spi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.spi.business.FormationService;
import fr.univbrest.dosi.spi.entites.Formation;


@RestController
@RequestMapping(value ="/formation")
public class FormationController {

	
	private FormationService formationServ;
	@Autowired
	public void FormationController(FormationService formationServ){
		this.formationServ =formationServ;
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<Formation> getFormations() {
		return formationServ.findAll();
	}
	
	@RequestMapping(value="/{codeFormation}",method=RequestMethod.GET)
	public Formation retrieveFormation(@PathVariable("codeFormation") String codeFormation){
		return formationServ.findOneFormation(codeFormation);
	}
	
	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public Formation ajouterFormation(@RequestBody Formation formation) {
		return this.formationServ.addFormation(formation);
}
	
	@RequestMapping(value = "/supprimer", method = RequestMethod.DELETE)
	public void deleteFormation(@RequestBody String codeFormation) {
		 this.formationServ.deleteFormation(codeFormation);
}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void updateFormation(@RequestBody Formation formation) {
		 this.formationServ.updateFormation(formation);
}
}
