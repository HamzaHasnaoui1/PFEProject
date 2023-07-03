package ma.monavocat.Entities;

import javax.persistence.*;

@Entity
public class DossierAvocat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DossierEntity getDossierEntity() {
        return dossierEntity;
    }

    public void setDossierEntity(DossierEntity dossierEntity) {
        this.dossierEntity = dossierEntity;
    }

    public AvocatEntity getAvocatEntity() {
        return avocatEntity;
    }

    public void setAvocatEntity(AvocatEntity avocatEntity) {
        this.avocatEntity = avocatEntity;
    }
    @JoinColumn(name = "dossierEntity_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DossierEntity dossierEntity;

    @JoinColumn(name = "avocatEntity_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private AvocatEntity avocatEntity;
}
