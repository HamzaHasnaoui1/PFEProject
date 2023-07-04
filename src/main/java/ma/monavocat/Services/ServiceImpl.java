package ma.monavocat.Services;

import ma.monavocat.Dtos.ServiceDto;
import ma.monavocat.Entities.ServiceEntity;
import ma.monavocat.Mappers.ServiceMapper;
import ma.monavocat.Repository.ServiceRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements ma.monavocat.Services.Service {
    private final static Logger LOGGER= LoggerFactory.getLogger(TribunalServiceImpl.class);
    private final ServiceMapper serviceMapper = Mappers.getMapper(ServiceMapper.class);
    private final ServiceRepository serviceRepository;

    public ServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public ServiceEntity ajouterService(ServiceDto serviceDto) {
        ServiceEntity tribunalEntity = serviceMapper.serviceDtoToServiceEntity(serviceDto);
        return serviceRepository.save(tribunalEntity) ;
    }

    @Override
    public ServiceEntity modifierService(ServiceDto s) {
        Optional<ServiceEntity> serviceAModifer = serviceRepository.findById(s.getId());
        if (serviceAModifer.isPresent()) {
            ServiceEntity serviceEntity = serviceAModifer.get();
            serviceEntity = serviceMapper.serviceDtoToServiceEntity(s);
            serviceRepository.save(serviceEntity);
            return serviceEntity;
        }
        return null;
    }

    @Override
    public Boolean supprimerService(ServiceDto s) {
        LOGGER.debug("start method delete id : {} ",s);
        serviceRepository.deleteById((serviceMapper.serviceDtoToServiceEntity(s)).getId());
        return true;
    }


    @Override
    public List<ServiceEntity> afficherListService() {
        return  serviceRepository.findAll();
    }
}
