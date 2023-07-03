package ma.monavocat.Mappers;

import ma.monavocat.Dtos.DossierDto;
import ma.monavocat.Entities.DossierEntity;
import org.mapstruct.Mapper;

@Mapper
public interface DossierMapper {
    DossierEntity dossierDtotoDossierEntity(DossierDto dossierDto);
    DossierDto dossierEntitytoDossierDto(DossierEntity dossierEntity);

}
