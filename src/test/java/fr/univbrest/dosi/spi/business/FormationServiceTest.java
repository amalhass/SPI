package fr.univbrest.dosi.spi.business;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.univbrest.dosi.spi.AppTestConfig;
import fr.univbrest.dosi.spi.dao.FormationRepository;
import fr.univbrest.dosi.spi.entites.Formation;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppTestConfig.class)
public class FormationServiceTest {
	FormationServiceJPA formationServ;
	FormationRepository formationRepo;

	@Before
	public void init() {
		formationRepo = new FormationServiceStub();
		formationServ = new FormationServiceJPA(formationRepo);
	}

	@Test
	public void doitAjouterUneFormation() {

		Formation formation1 = new Formation();
		formation1.setCodeFormation("M2Dosi");
		formation1.setDebutAccreditation(new Date("01/09/12"));
		formation1.setDiplome("ingénieur");
		formation1.setDoubleDiplome("oui");
		formation1.setFinAccreditation(new Date("30/09/17"));
		formation1.setN0Annee(new BigDecimal(2));
		formation1.setNomFormation("Dévollepement à l'offshore des systèmes d'info");
		formationServ.addFormation(formation1);

		assertThat(formationServ.findAll()).hasSize(1);
	}

}
