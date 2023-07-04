package ma.monavocat.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class TribunalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String nom ;
    private String adresse ;
    private String type;

    @OneToMany(fetch = FetchType.LAZY)
    private List<DossierEntity> dossierEntities;

    public TribunalEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DossierEntity> getDossiers() {
        return dossierEntities;
    }

    public void setDossiers(List<DossierEntity> dossierEntities) {
        this.dossierEntities = dossierEntities;
    }


    public TribunalEntity(Long id, String adresse, String nom, String type, List<DossierEntity> dossierEntities) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.type = type;
        this.dossierEntities = dossierEntities;
    }

    @Override
    public String toString() {
        return "TribunalEntity{" +
                "id=" + id +
                ", adresse='" + adresse + '\'' +
                ", nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", dossierEntities=" + dossierEntities +
                '}';
    }
}
