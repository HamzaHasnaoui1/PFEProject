package ma.monavocat.Services;

import ma.monavocat.Dtos.ClientDto;
import ma.monavocat.Entities.ClientEntity;

import java.util.List;

public interface ClientService {
    ClientDto ajouterClient(ClientDto clientDto);

    ClientDto modifierClient(ClientDto dto);

    boolean delete(ClientDto clientDto);

    List<ClientEntity> afficherListClient();

    List<ClientDto> selectAll();
}
