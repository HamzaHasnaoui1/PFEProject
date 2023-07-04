package ma.monavocat.Entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private LocalDateTime dateRdv ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateRdv() {
        return dateRdv;
    }

    public void setDateRdv(LocalDateTime dateRdv) {
        this.dateRdv = dateRdv;
    }

    public AvocatEntity getAvocatEntity() {
        return avocatEntity;
    }

    public void setAvocatEntity(AvocatEntity avocatEntity) {
        this.avocatEntity = avocatEntity;
    }

    public ClientEntity getClient() {
        return clientEntity;
    }

    public void setClient(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    @JoinColumn(name = "avocatEntity_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private AvocatEntity avocatEntity;

    @JoinColumn(name = "client_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ClientEntity clientEntity;
}
