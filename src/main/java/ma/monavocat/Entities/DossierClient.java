package ma.monavocat.Entities;

import javax.persistence.*;

@Entity
public class DossierClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientEntity getClient() {
        return clientEntity;
    }

    public void setClient(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public DossierEntity getDossierEntity() {
        return dossierEntity;
    }

    public void setDossierEntity(DossierEntity dossierEntity) {
        this.dossierEntity = dossierEntity;
    }

    @JoinColumn(name = "client_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ClientEntity clientEntity;
    @JoinColumn(name = "dossierEntity_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DossierEntity dossierEntity;
}
