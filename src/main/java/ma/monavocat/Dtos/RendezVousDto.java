package ma.monavocat.Dtos;

import java.time.LocalDateTime;

public class RendezVousDto {
    private  int clientId ;
    private  int avocatId ;
    private LocalDateTime dateRDV ;

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

    public LocalDateTime getDateRDV() {
        return dateRDV;
    }

    public void setDateRDV(LocalDateTime dateRDV) {
        this.dateRDV = dateRDV;
    }

    @Override
    public String toString() {
        return "RendezVousDto{" +
                "clientId=" + clientId +
                ", avocatId=" + avocatId +
                ", dateRDV=" + dateRDV +
                '}';
    }
}
