package ma.monavocat.Repository;

import ma.monavocat.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserEntity,String> {
    UserEntity findByUserName(String userName);
}
