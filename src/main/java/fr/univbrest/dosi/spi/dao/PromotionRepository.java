package fr.univbrest.dosi.spi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.spi.entites.Promotion;



@Repository
public interface PromotionRepository extends CrudRepository<Promotion, String>{

	public List<Promotion> findBySiglePromotion(String siglePromotion);
}
