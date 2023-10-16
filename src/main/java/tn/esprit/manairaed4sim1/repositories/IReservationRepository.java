package tn.esprit.manairaed4sim1.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.manairaed4sim1.entites.Reservation;

public interface IReservationRepository extends CrudRepository<Reservation,Long>{
}
