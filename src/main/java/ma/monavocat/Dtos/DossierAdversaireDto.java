package ma.monavocat.Dtos;

public class DossierAdversaireDto {
    private  int clientId ;
    private  int avocatId ;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getAvocatId() {
        return avocatId;
    }

    public void setAvocatId(int avocatId) {
        this.avocatId = avocatId;
    }

    @Override
    public String toString() {
        return "DossierAdversaireDto{" +
                "clientId=" + clientId +
                ", avocatId=" + avocatId +
                '}';
    }
}
