package ma.monavocat.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class AvocatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String code;

    public AvocatEntity(Long id, String nom, String prenom, String code, int telephone, String mail, List<RendezVous> rendezVous, List<DossierAvocat> dossierAvocats) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.code = code;
        this.telephone = telephone;
        this.mail = mail;
        this.rendezVous = rendezVous;
        this.dossierAvocats = dossierAvocats;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public List<RendezVous> getRendezVous() {
        return rendezVous;
    }

    public void setRendezVous(List<RendezVous> rendezVous) {
        this.rendezVous = rendezVous;
    }

    public List<DossierAvocat> getDossierAvocats() {
        return dossierAvocats;
    }

    public void setDossierAvocats(List<DossierAvocat> dossierAvocats) {
        this.dossierAvocats = dossierAvocats;
    }

    private int telephone;
    private String mail;

    @OneToMany(fetch = FetchType.LAZY)
    private List<RendezVous> rendezVous;

    @OneToMany(fetch = FetchType.LAZY)
    private List<DossierAvocat> dossierAvocats;

}

