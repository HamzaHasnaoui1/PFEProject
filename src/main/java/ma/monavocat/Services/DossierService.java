package ma.monavocat.Services;

import ma.monavocat.Dtos.DossierDto;
import ma.monavocat.Entities.DossierEntity;

import java.util.List;

public interface DossierService {
        DossierDto ajouterDossier(DossierDto dossierDto);

        DossierDto modifierDossier(DossierDto dossierDto);

        boolean delete(DossierDto dossierDto );

        List<DossierDto> selectAll();

    List<DossierEntity> afficherListDossier();

}

