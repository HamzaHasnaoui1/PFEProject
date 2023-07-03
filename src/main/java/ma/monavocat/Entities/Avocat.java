package ma.monavocat.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Avocat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String code;
    private int telephone;
    private String mail;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "avocat")
    private List<RendezVous> rendezVous;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "avocat")
    private List<DossierAvocat> dossierAvocats;

}

