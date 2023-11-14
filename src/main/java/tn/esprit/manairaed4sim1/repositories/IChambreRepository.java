package tn.esprit.manairaed4sim1.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.manairaed4sim1.entites.Chambre;

import java.util.List;

public interface IChambreRepository extends CrudRepository<Chambre,Long> {
    Chambre findByNumeroChambre(Long numChambre);
}
