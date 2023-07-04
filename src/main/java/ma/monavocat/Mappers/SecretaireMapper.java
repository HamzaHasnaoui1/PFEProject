package ma.monavocat.Mappers;

import ma.monavocat.Dtos.SecretaireDto;
import ma.monavocat.Entities.SecretaireEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SecretaireMapper {
    SecretaireEntity secretaireDtoToSecretaireEntity(SecretaireDto secretaireDto);
    SecretaireDto secretaireEntityToSecretaireDto (SecretaireEntity secretaireEntity);
}
