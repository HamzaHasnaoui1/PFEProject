package ma.monavocat.Services;

import ma.monavocat.Dtos.DossierDto;
import ma.monavocat.Entities.DossierEntity;

import java.util.List;

public interface DossierService {
        DossierDto save(DossierDto dossierDto);

        DossierDto update(DossierDto dossierDto);

        Boolean delete(DossierDto dossierDto );

        List<DossierDto> selectAll();

    List<DossierEntity> afficherListDossier();

}

