package ma.monavocat.Dtos;

public class TribunalDto {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;
    private String adresse ;
    private String nom ;
    private String type;

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

    public TribunalDto(Long id) {
        this.id = id;
    }

    public TribunalDto(Long id, String adresse, String nom, String type) {
        this.id = id;
        this.adresse = adresse;
        this.nom = nom;
        this.type = type;
    }

    public TribunalDto(long id) {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TribunalDto{" +
                "id=" + id +
                ", adresse='" + adresse + '\'' +
                ", nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
