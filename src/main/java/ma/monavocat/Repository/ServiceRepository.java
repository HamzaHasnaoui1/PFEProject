package ma.monavocat.Repository;

import ma.monavocat.Entities.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository <ServiceEntity , Long> {
}
