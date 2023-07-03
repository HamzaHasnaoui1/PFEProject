package ma.monavocat.Dtos;

public class DossierDto {
private String numeroDossier;
private  String numeroDossierTribunal;
private  String tribunalId;
private String description;
private String type ;
private String nomAdversaire;
private String etat;

    public DossierDto(long id) {

    }

    public DossierDto() {

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

    public String getTribunalId() {
        return tribunalId;
    }

    public void setTribunalId(String tribunalId) {
        this.tribunalId = tribunalId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNomAdversaire() {
        return nomAdversaire;
    }

    public void setNomAdversaire(String nomAdversaire) {
        this.nomAdversaire = nomAdversaire;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "DossierDto{" +
                "numeroDossier='" + numeroDossier + '\'' +
                ", numeroDossierTribunal='" + numeroDossierTribunal + '\'' +
                ", tribunalId='" + tribunalId + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", nomAdversaire='" + nomAdversaire + '\'' +
                ", etat='" + etat + '\'' +
                '}';
    }
}
