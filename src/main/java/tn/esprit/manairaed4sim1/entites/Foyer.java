package tn.esprit.manairaed4sim1.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToOne (mappedBy = "foyer")
    Universite universite;

    @OneToMany (mappedBy = "foyer", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    Set<Bloc> setBlocs;
}
