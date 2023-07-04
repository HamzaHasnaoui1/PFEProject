package ma.monavocat.Mappers;

import ma.monavocat.Dtos.AvocatDto;
import ma.monavocat.Entities.AvocatEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AvocatMapper {
    AvocatEntity avocatDtoToAvocatEntity (AvocatDto avocatDto);
    AvocatDto avocatEntityToAvocatDto (AvocatEntity avocatEntity);

    List<AvocatDto> avocatEntityToAvocatDto(List<AvocatEntity> all);
}
