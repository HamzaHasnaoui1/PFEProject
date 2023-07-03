package ma.monavocat.Mappers;

import ma.monavocat.Dtos.DossierAdversaireDto;
import ma.monavocat.Entities.DossierAdversaireEntity;
import org.mapstruct.Mapper;

@Mapper
public interface DossierAdversaireMapper {
    DossierAdversaireEntity dossierAdversaireDtoToDossierAdversaireEntity(DossierAdversaireDto dossierAdversaireDto);
    DossierAdversaireDto dossierAdversaireEntityToDossierAdversaireDto(DossierAdversaireEntity dossierAdversaireEntity);
}
