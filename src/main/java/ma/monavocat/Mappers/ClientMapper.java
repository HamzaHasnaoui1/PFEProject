package ma.monavocat.Mappers;

import ma.monavocat.Dtos.ClientDto;
import ma.monavocat.Entities.ClientEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ClientMapper {
    ClientEntity clientDtoToClientEntity (ClientDto clientDto);
    ClientDto clientEntityToClientDto ( ClientEntity clientEntity);

    List<ClientDto> clientEntityToClientDto(List<ClientEntity> all);
}
