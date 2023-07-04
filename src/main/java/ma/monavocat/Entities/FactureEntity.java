package ma.monavocat.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class FactureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numFacture;
    private LocalDateTime dateFacture ;
    private Long idClient;
    private String statutPaiement;
    private String methodePaiement;
    private String reference;
    private String remarque;
    private LocalDateTime datePaiement;
    private int montantFacture;

    public FactureEntity(Long id, int numFacture, LocalDateTime dateFacture, Long idClient, String statutPaiement, String methodePaiement, String reference, String remarque, LocalDateTime datePaiement, int montantFacture) {
        this.id = id;
        this.numFacture = numFacture;
        this.dateFacture = dateFacture;
        this.idClient = idClient;
        this.statutPaiement = statutPaiement;
        this.methodePaiement = methodePaiement;
        this.reference = reference;
        this.remarque = remarque;
        this.datePaiement = datePaiement;
        this.montantFacture = montantFacture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumFacture() {
        return numFacture;
    }

    public void setNumFacture(int numFacture) {
        this.numFacture = numFacture;
    }

    public LocalDateTime getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(LocalDateTime dateFacture) {
        this.dateFacture = dateFacture;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getStatutPaiement() {
        return statutPaiement;
    }

    public void setStatutPaiement(String statutPaiement) {
        this.statutPaiement = statutPaiement;
    }

    public String getMethodePaiement() {
        return methodePaiement;
    }

    public void setMethodePaiement(String methodePaiement) {
        this.methodePaiement = methodePaiement;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public LocalDateTime getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDateTime datePaiement) {
        this.datePaiement = datePaiement;
    }

    public int getMontantFacture() {
        return montantFacture;
    }

    public void setMontantFacture(int montantFacture) {
        this.montantFacture = montantFacture;
    }

    @Override
    public String toString() {
        return "FactureEntity{" +
                "id=" + id +
                ", numFacture=" + numFacture +
                ", dateFacture=" + dateFacture +
                ", idClient=" + idClient +
                ", statutPaiement='" + statutPaiement + '\'' +
                ", methodePaiement='" + methodePaiement + '\'' +
                ", reference='" + reference + '\'' +
                ", remarque='" + remarque + '\'' +
                ", datePaiement=" + datePaiement +
                ", montantFacture=" + montantFacture +
                '}';
    }
}
