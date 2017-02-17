package fr.univbrest.dosi.spi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.spi.business.EnseignantService;
import fr.univbrest.dosi.spi.entites.Enseignant;
import fr.univbrest.dosi.spi.entites.Formation;
@RestController
@RequestMapping(value ="/enseignant")
public class EnseignantController {

	EnseignantService enseignantService;
	
	@Autowired
	public void EnseignantController(EnseignantService enseignantServ){
		this.enseignantService=enseignantServ;
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<Enseignant> getEnseignants(){
		return enseignantService.findAll();
		
	}
	@RequestMapping(value="/{noEnseignant}",method=RequestMethod.GET)
	public Enseignant retrieveEnseignant(@PathVariable("noEnseignant") long noEnseignant){
		return enseignantService.findById(noEnseignant);
	}
	
	 @RequestMapping(value="/ajouter",method=RequestMethod.POST)
	 public Enseignant ajouterEnseignant(@RequestBody Enseignant enseignant){
		 return this.enseignantService.addEnseignant(enseignant);
	 }

	 @RequestMapping(value="/supprimer/{noEnseignant}",method=RequestMethod.DELETE)
	 public void deleteEnseignant(@PathVariable("noEnseignant") long noEnseignant){
		 this.enseignantService.deleteEnseignant(noEnseignant);
	 }
	 @RequestMapping(value="/update",method=RequestMethod.PUT)
	 public Enseignant updateEnseignant(@RequestBody Enseignant enseignant){
		 return this.enseignantService.updateEnseignant(enseignant);
	 }
}
