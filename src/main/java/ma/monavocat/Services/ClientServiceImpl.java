package ma.monavocat.Services;

import ma.monavocat.Dtos.ClientDto;
import ma.monavocat.Entities.ClientEntity;
import ma.monavocat.Mappers.ClientMapper;
import ma.monavocat.Repository.ClientRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    private final static Logger LOGGER = LoggerFactory.getLogger(ClientServiceImpl.class);
    public static ClientEntity gestionClientEntity;
    private ClientRepository clientRepository;
    private ClientMapper clientMapper = Mappers.getMapper(ClientMapper.class);

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    @Override
    public ClientDto ajouterClient(ClientDto clientDto) {
        LOGGER.debug("start method save dto : {} ", clientDto);
        LOGGER.debug("Mapping Dto to Entity : {} ", clientMapper.clientDtoToClientEntity(clientDto));
        ClientDto re = clientMapper.clientEntityToClientDto(clientRepository.save(clientMapper.clientDtoToClientEntity(
                clientDto)));
        return re;
    }


    @Override
    public ClientDto modifierClient(ClientDto dto) {
        LOGGER.debug("start method save dto : {} ",dto);
        ClientDto re = clientMapper.clientEntityToClientDto(clientRepository.save(clientMapper.clientDtoToClientEntity(dto)));
        return re;
    }
    @Override
    public boolean delete(ClientDto clientDto) {
        LOGGER.debug("start method delete id : {} ", clientDto);
        clientRepository.deleteById((clientMapper.clientDtoToClientEntity(clientDto)).getId());
        return true;
    }
    @Override
    public List<ClientEntity> afficherListClient() {
        return  clientRepository.findAll();
    }
    @Override
    public List<ClientDto> selectAll() {
        LOGGER.debug("start method select All");
        return clientMapper.clientEntityToClientDto(clientRepository.findAll());
    }

}
