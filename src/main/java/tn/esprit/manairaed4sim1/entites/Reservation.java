package tn.esprit.manairaed4sim1.entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;

    private String numReservation;

    private LocalDate debutAnneUniver;
    private LocalDate finAnneUniver;
    private boolean estValide;

    @ManyToMany
    Set<Etudiant> setEtudiants;
}
