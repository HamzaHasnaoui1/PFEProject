package ma.monavocat.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class DossierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    public List<DossierAdversaireEntity> getDossierAdversaireEntities() {
        return dossierAdversaireEntities;
    }

    public void setDossierAdversaireEntities(List<DossierAdversaireEntity> dossierAdversaireEntities) {
        this.dossierAdversaireEntities = dossierAdversaireEntities;
    }

    private String numeroDossier;
    private String numeroDossierTribunal;
    private String observation ;
    private String etat ;
    private String type;
    private String description ;

    @JoinColumn(name = "tribunal_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TribunalEntity tribunalEntity;

    @OneToMany(fetch = FetchType.LAZY)
    private List<DossierAvocat> dossierAvocats;

    @OneToMany(fetch = FetchType.LAZY)
    private List<DossierAdversaireEntity> dossierAdversaireEntities;

    @OneToMany(fetch = FetchType.LAZY)
    private List<DossierClient> dossierClients;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDossier() {
        return numeroDossier;
    }

    public void setNumeroDossier(String numeroDossier) {
        this.numeroDossier = numeroDossier;
    }

    public String getNumeroDossierTribunal() {
        return numeroDossierTribunal;
    }

    public void setNumeroDossierTribunal(String numeroDossierTribunal) {
        this.numeroDossierTribunal = numeroDossierTribunal;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TribunalEntity getTribunalEntity() {
        return tribunalEntity;
    }

    public void setTribunalEntity(TribunalEntity tribunalEntity) {
        this.tribunalEntity = tribunalEntity;
    }

    public List<DossierAvocat> getDossierAvocats() {
        return dossierAvocats;
    }

    public void setDossierAvocats(List<DossierAvocat> dossierAvocats) {
        this.dossierAvocats = dossierAvocats;
    }

    public List<DossierAdversaireEntity> getDossierAdversaires() {
        return dossierAdversaireEntities;
    }

    public void setDossierAdversaires(List<DossierAdversaireEntity> dossierAdversaireEntities) {
        this.dossierAdversaireEntities = dossierAdversaireEntities;
    }

    public List<DossierClient> getDossierClients() {
        return dossierClients;
    }

    public void setDossierClients(List<DossierClient> dossierClients) {
        this.dossierClients = dossierClients;
    }

    @Override
    public String toString() {
        return "DossierEntity{" +
                "id=" + id +
                ", numeroDossier='" + numeroDossier + '\'' +
                ", numeroDossierTribunal='" + numeroDossierTribunal + '\'' +
                ", observation='" + observation + '\'' +
                ", etat='" + etat + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", tribunalEntity=" + tribunalEntity +
                ", dossierAvocats=" + dossierAvocats +
                ", dossierAdversaires=" + dossierAdversaireEntities +
                ", dossierClients=" + dossierClients +
                '}';
    }
}
