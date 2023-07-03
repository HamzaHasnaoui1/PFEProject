package ma.monavocat.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String nom ;
    private String prenom ;
    private String cin;
    private int telephone ;
    private String mail ;
    private String adresse;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<RendezVous> rendezVous;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<DossierClient> dossierClients;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private  List<DossierAdversaire> dossierAdversaires;
}
