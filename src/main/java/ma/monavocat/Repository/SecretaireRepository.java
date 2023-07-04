package ma.monavocat.Repository;

import ma.monavocat.Entities.SecretaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretaireRepository extends JpaRepository <SecretaireEntity, Long> {
}
