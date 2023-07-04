package ma.monavocat.Services;

import ma.monavocat.Dtos.SecretaireDto;
import ma.monavocat.Entities.SecretaireEntity;

public interface SecretaireService {
    SecretaireEntity modifierSecretaire(SecretaireDto s);
}
