package ma.monavocat.Mappers;

import ma.monavocat.Dtos.ServiceDto;
import ma.monavocat.Entities.ServiceEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ServiceMapper {
    ServiceEntity serviceDtoToServiceEntity(ServiceDto serviceDto);
}
