package ma.monavocat.Services;

import ma.monavocat.Dtos.SecretaireDto;
import ma.monavocat.Entities.SecretaireEntity;
import ma.monavocat.Mappers.SecretaireMapper;
import ma.monavocat.Repository.SecretaireRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SecretaireServiceImpl implements SecretaireService{
    private final static Logger LOGGER= LoggerFactory.getLogger(SecretaireServiceImpl.class);
    private final SecretaireMapper secretaireMapper = Mappers.getMapper(SecretaireMapper.class);
    private final SecretaireRepository secretaireRepository;

    public SecretaireServiceImpl(SecretaireRepository secretaireRepository) {
        this.secretaireRepository = secretaireRepository;
    }
    public SecretaireEntity ajouterSecretaire (SecretaireDto secretaireDto){
        SecretaireEntity secretaireEntity = secretaireMapper.secretaireDtoToSecretaireEntity(secretaireDto);
        return secretaireRepository.save(secretaireEntity) ;
    }
    @Override
    public SecretaireEntity modifierSecretaire(SecretaireDto s) {
        Optional<SecretaireEntity> secretaireAModifer = secretaireRepository.findById(s.getId());
        if (secretaireAModifer.isPresent()) {
            SecretaireEntity secretaireEntity = secretaireAModifer.get();
            secretaireEntity = secretaireMapper.secretaireDtoToSecretaireEntity(s);
            secretaireRepository.save(secretaireEntity);
            return secretaireEntity;
        }
        return null;

    }
}
