package ma.monavocat.Mappers;

import ma.monavocat.Dtos.FactureDto;
import ma.monavocat.Entities.FactureEntity;
import org.mapstruct.Mapper;

@Mapper
public interface FactureMapper {
    FactureEntity factureDtoToFactureEntity(FactureDto factureDto);
    FactureDto factureEntityToFactureDto(FactureEntity factureEntity);
}
