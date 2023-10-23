package tn.esprit.manairaed4sim1.services;

import tn.esprit.manairaed4sim1.entites.Foyer;
import tn.esprit.manairaed4sim1.entites.Reservation;

import java.util.List;

public interface ReservationService {
    public Reservation createReservation (Reservation R);
    public Reservation updateReservation (Reservation R);
    public List<Reservation> getAllReservation ();
    public Reservation getReservation(Long id);
    public void deleteReservation(Long id);
}
