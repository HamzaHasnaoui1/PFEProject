package ma.monavocat.Repository;

import ma.monavocat.Entities.DossierAdversaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierAdversaireRepository extends JpaRepository <DossierAdversaire, Long> {
}
