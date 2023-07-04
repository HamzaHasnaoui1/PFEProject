package ma.monavocat.Controllers;

import ma.monavocat.Dtos.ServiceDto;
import ma.monavocat.Dtos.TribunalDto;
import ma.monavocat.Entities.ServiceEntity;
import ma.monavocat.Entities.TribunalEntity;
import ma.monavocat.Services.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceController {
    private final static Logger LOGGER= LoggerFactory.getLogger(TribunalController.class);
    @Autowired
    private final ServiceImpl serviceImpl;

    public ServiceController(ServiceImpl service, ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    @PostMapping()
    public ServiceEntity ajouterService(@RequestBody ServiceDto serviceDto) {
        return serviceImpl.ajouterService(serviceDto);
    }

    @GetMapping("/list")
    public List<ServiceEntity> afficherListService() {
        return serviceImpl.afficherListService();
    }

    @PutMapping
    public ServiceEntity modifierService(@RequestBody ServiceDto serviceDto) {
        return serviceImpl.modifierService(serviceDto);
    }
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") long id) {
        LOGGER.debug("start method select by id {}",id);
        ServiceDto idcomp =new ServiceDto(id);
        return serviceImpl.supprimerService(idcomp);
    }
}
