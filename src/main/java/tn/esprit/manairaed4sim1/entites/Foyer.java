package tn.esprit.manairaed4sim1.entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Foyer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne (mappedBy = "foyer")
    Universite universite;

    @OneToMany (mappedBy = "foyer")
    Set<Bloc> setBlocs;
}
