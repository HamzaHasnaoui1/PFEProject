package ma.monavocat.Repository;

import ma.monavocat.Entities.TribunalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TribunalRepository extends JpaRepository <TribunalEntity, Long> {
}
