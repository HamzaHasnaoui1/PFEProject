package ma.monavocat.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class DossierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String numeroDossier;
    private String numeroDossierTribunal;
    private String observation ;
    private String etat ;
    private String type;
    private String description ;

    @ManyToOne(fetch = FetchType.LAZY)
    private TribunalEntity tribunalEntity;

    @OneToMany(fetch = FetchType.LAZY)
    private List<DossierAvocat> dossierAvocats;

    @OneToMany(fetch = FetchType.LAZY)
    private List<DossierAdversaire> dossierAdversaires;

    @OneToMany(fetch = FetchType.LAZY)
    private List<DossierClient> dossierClients;

}
