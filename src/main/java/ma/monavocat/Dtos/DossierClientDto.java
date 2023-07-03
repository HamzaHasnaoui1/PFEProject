package ma.monavocat.Dtos;

public class DossierClientDto {
    private  int clientId ;
    private  int dossierId ;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getDossierId() {
        return dossierId;
    }

    public void setDossierId(int dossierId) {
        this.dossierId = dossierId;
    }

    @Override
    public String toString() {
        return "DossierClientDto{" +
                "clientId=" + clientId +
                ", dossierId=" + dossierId +
                '}';
    }
}
