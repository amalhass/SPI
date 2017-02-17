package fr.univbrest.dosi.spi.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.spi.AppTestConfig;
import fr.univbrest.dosi.spi.entites.Formation;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppTestConfig.class)
public class FormationRepositoryTest {

	@Autowired
	private FormationRepository formationRepo;

	@Before
	public void init() {
		Formation formation1 = new Formation();
		formation1.setCodeFormation("M2Dosi");
		formation1.setDebutAccreditation(new Date("01/09/12"));
		formation1.setDiplome("ingénieur");
		formation1.setDoubleDiplome("oui");
		formation1.setFinAccreditation(new Date("30/09/17"));
		formation1.setN0Annee(new BigDecimal(2));
		formation1.setNomFormation("Dévollepement à l'offshore des systèmes d'info");
		formationRepo.save(formation1);
		
		Formation formation2 = new Formation();
		formation2.setCodeFormation("M1TILL");
		formation2.setDebutAccreditation(new Date("01/09/12"));
		formation2.setDiplome("M1");
		formation2.setDoubleDiplome("non");
		formation2.setFinAccreditation(new Date("30/09/17"));
		formation2.setN0Annee(new BigDecimal(2));
		formation2.setNomFormation("Master technologie de l'Information et Ingénierie du Logiciel");
		formationRepo.save(formation2);

	}
	
	
	   @Test
	   public void doitCompterLesFormations() {
	       long resultat = formationRepo.count();

	       assertThat(resultat).isEqualTo(2L);
	}
	   
	 

}
