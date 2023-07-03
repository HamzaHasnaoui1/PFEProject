package ma.monavocat.Mappers;

import ma.monavocat.Dtos.AvocatDto;
import ma.monavocat.Entities.AvocatEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AvocatMapper {
    AvocatEntity avocatDtoToAvocatEntity (AvocatDto avocatDto);
    AvocatDto avocatEntityToAvocatDto (AvocatEntity avocatEntity);
}
