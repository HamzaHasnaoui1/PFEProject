package ma.monavocat.Entities;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private LocalDateTime dateRdv ;

    @JoinColumn(name = "avocat_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Avocat avocat;

    @JoinColumn(name = "client_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client ;
}
