package ma.monavocat.Services;

import ma.monavocat.Dtos.ServiceDto;
import ma.monavocat.Entities.ServiceEntity;

import java.util.List;

public interface Service {
    ServiceEntity ajouterService (ServiceDto serviceDto);

    ServiceEntity modifierService(ServiceDto s);

    Boolean supprimerService(ServiceDto s );

    List<ServiceEntity> afficherListService();
}
