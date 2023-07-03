package ma.monavocat.Repository;

import ma.monavocat.Entities.DossierAvocat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierAvocatRepository extends JpaRepository <DossierAvocat, Long> {
}
