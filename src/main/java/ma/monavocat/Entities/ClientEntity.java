package ma.monavocat.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String nom ;
    private String prenom ;
    private String cin;
    private int telephone ;
    private String mail ;
    private String adresse;

    @OneToMany(fetch = FetchType.LAZY)
    private List<RendezVous> rendezVous;

    @OneToMany(fetch = FetchType.LAZY)
    private List<DossierClient> dossierClients;

    @OneToMany(fetch = FetchType.LAZY)
    private  List<DossierAdversaireEntity> dossierAdversaireEntities;

    public ClientEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<RendezVous> getRendezVous() {
        return rendezVous;
    }

    public void setRendezVous(List<RendezVous> rendezVous) {
        this.rendezVous = rendezVous;
    }

    public List<DossierClient> getDossierClients() {
        return dossierClients;
    }

    public void setDossierClients(List<DossierClient> dossierClients) {
        this.dossierClients = dossierClients;
    }

    public List<DossierAdversaireEntity> getDossierAdversaireEntities() {
        return dossierAdversaireEntities;
    }

    public void setDossierAdversaireEntities(List<DossierAdversaireEntity> dossierAdversaireEntities) {
        this.dossierAdversaireEntities = dossierAdversaireEntities;
    }

    public ClientEntity(Long id, String nom, String prenom, String cin, int telephone, String mail, String adresse, List<RendezVous> rendezVous, List<DossierClient> dossierClients, List<DossierAdversaireEntity> dossierAdversaireEntities) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.telephone = telephone;
        this.mail = mail;
        this.adresse = adresse;
        this.rendezVous = rendezVous;
        this.dossierClients = dossierClients;
        this.dossierAdversaireEntities = dossierAdversaireEntities;
    }

    @Override
    public String toString() {
        return "ClientEntity{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin='" + cin + '\'' +
                ", telephone=" + telephone +
                ", mail='" + mail + '\'' +
                ", adresse='" + adresse + '\'' +
                ", rendezVous=" + rendezVous +
                ", dossierClients=" + dossierClients +
                ", dossierAdversaireEntities=" + dossierAdversaireEntities +
                '}';
    }
}
