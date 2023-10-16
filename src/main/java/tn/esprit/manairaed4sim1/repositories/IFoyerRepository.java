package tn.esprit.manairaed4sim1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.manairaed4sim1.entites.Foyer;

import java.util.List;
import java.util.SimpleTimeZone;

public interface IFoyerRepository extends CrudRepository<Foyer,Long> {

    List<Foyer> findByNomFoyer(String nom);

    List<Foyer> getFoyerByCapaciteFoyerBetweenAndNomFoyer(long val1, long val2, String nom);

    @Query("select f. from Foyer f")
    List<Foyer> retrieveAll();

}
