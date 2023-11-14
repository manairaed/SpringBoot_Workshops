package tn.esprit.manairaed4sim1.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.manairaed4sim1.entites.Chambre;
import tn.esprit.manairaed4sim1.entites.Etudiant;
import tn.esprit.manairaed4sim1.entites.Reservation;
import tn.esprit.manairaed4sim1.repositories.IChambreRepository;
import tn.esprit.manairaed4sim1.repositories.IEtudiantRepository;
import tn.esprit.manairaed4sim1.repositories.IReservationRepository;
import tn.esprit.manairaed4sim1.services.ReservationService;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final IReservationRepository reservationRepository;
    private final IChambreRepository chambreRepository;
    private final IEtudiantRepository etudiantRepository;

    @Override
    public Reservation createReservation(Reservation R) {
        return reservationRepository.save(R);
    }

    @Override
    public Reservation updateReservation(Reservation R) {
        return reservationRepository.save(R);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return (List<Reservation>) reservationRepository.findAll() ;   }

    @Override
    public Reservation getReservation(Long id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation ajouterReservation(long idChambre, long cinEtudiant) {
        Chambre chambre = chambreRepository.findById(idChambre).orElse(null);
        Etudiant etudiant = etudiantRepository.findByCin(cinEtudiant);
        Reservation reservation = new Reservation();
        String num = chambre.getNumeroChambre()+chambre.getBloc().getNomBloc()+cinEtudiant;
        reservation.setNumReservation(num);
        reservation.setEstValide(true);
        int anneCourante= LocalDate.now().getYear();
        reservation.setDebutAnneUniver(LocalDate.parse(anneCourante+"-"+"01-09"));
        reservation.setFinAnneUniver(LocalDate.parse(anneCourante+1+"-"+"01-06"));
        int numReservation = chambre.getSetReservations().size();

        if (numReservation == 1 && chambre.getTypeC().equals("SIMPLE")) {
            reservationRepository.save(reservation);
           }
        else if (numReservation == 2 && chambre.getTypeC().equals("DOUBLE")) {
            reservationRepository.save(reservation);
        }
        else if (numReservation == 3 && chambre.getTypeC().equals("TRIPLE")) {
            reservationRepository.save(reservation);
        }
        else {
          return null;
        }
        return reservation;
    }
}
