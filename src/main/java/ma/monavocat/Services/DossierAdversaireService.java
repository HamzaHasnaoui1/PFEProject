package ma.monavocat.Services;

import ma.monavocat.Dtos.DossierAdversaireDto;
import ma.monavocat.Dtos.DossierDto;
import ma.monavocat.Entities.DossierAdversaireEntity;

import java.util.List;

public interface DossierAdversaireService {

    boolean delete(DossierAdversaireDto dossierAdversaireDto );

    DossierAdversaireDto ajouterDossier(DossierAdversaireDto dossierAdversaireDto);

    List<DossierDto> selectAll();

    List<DossierAdversaireEntity> afficherListDossier();
}
