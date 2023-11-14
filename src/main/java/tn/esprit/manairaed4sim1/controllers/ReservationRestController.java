package tn.esprit.manairaed4sim1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.manairaed4sim1.entites.Reservation;
import tn.esprit.manairaed4sim1.services.ReservationService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("reservation")
@RestController
public class ReservationRestController {

    private final ReservationService reservationService;

    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @GetMapping("/all")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservation();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable("id") Long id) {
        return reservationService.getReservation(id);
    }

    @PutMapping("/{id}")
    public Reservation updateReservation(@PathVariable("id") Long id, @RequestBody Reservation updatedReservation) {
        return reservationService.updateReservation(updatedReservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable("id") Long id) {
        reservationService.deleteReservation(id);
    }

    @PostMapping("/addReservation/{id}/{cin}")
    public Reservation addReservationAvance (@PathVariable("id") Long id,@PathVariable("cin") Long cin) {
        return reservationService.ajouterReservation(id,cin);
    }

}