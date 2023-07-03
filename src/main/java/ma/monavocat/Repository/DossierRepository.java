package ma.monavocat.Repository;

import ma.monavocat.Entities.DossierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DossierRepository extends JpaRepository <DossierEntity, Long> {


    Optional<DossierEntity> findByNumeroDossier(String numeroDossier);
}
