package ma.monavocat.Repository;

import ma.monavocat.Entities.DossierClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierClientRepository extends JpaRepository <DossierClient, Long> {
}
