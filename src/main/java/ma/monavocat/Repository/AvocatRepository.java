package ma.monavocat.Repository;

import ma.monavocat.Entities.AvocatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvocatRepository extends JpaRepository <AvocatEntity, Long> {
}
