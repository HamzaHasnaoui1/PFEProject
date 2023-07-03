package ma.monavocat.Dtos;

public class DossierAvocatDto {
    private  int dossierId ;
    private  int avocatId ;

    public int getDossierId() {
        return dossierId;
    }

    public void setDossierId(int dossierId) {
        this.dossierId = dossierId;
    }

    public int getAvocatId() {
        return avocatId;
    }

    public void setAvocatId(int avocatId) {
        this.avocatId = avocatId;
    }

    @Override
    public String toString() {
        return "DossierAvocatDto{" +
                "dossierId=" + dossierId +
                ", avocatId=" + avocatId +
                '}';
    }
}
