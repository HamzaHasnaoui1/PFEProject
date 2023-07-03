package ma.monavocat.Mappers;

import ma.monavocat.Dtos.TribunalDto;
import ma.monavocat.Entities.TribunalEntity;
import org.mapstruct.Mapper;

@Mapper
public interface TribunalMapper {
    TribunalEntity tribunalDtoToTribunalEntity(TribunalDto tribunalDto);
}
