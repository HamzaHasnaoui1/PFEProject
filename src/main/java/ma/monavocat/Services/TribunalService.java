package ma.monavocat.Services;

import ma.monavocat.Dtos.TribunalDto;
import ma.monavocat.Entities.TribunalEntity;

import java.util.List;

public interface TribunalService {
    TribunalEntity creerTribunal (TribunalDto tribunalDto);

    TribunalEntity modifierTribunal(TribunalDto s);

    Boolean supprimerTribunal(TribunalDto s );

    List<TribunalEntity> afficherListTribunal();
}
