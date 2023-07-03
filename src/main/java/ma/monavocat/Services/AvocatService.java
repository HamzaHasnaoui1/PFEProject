package ma.monavocat.Services;

import ma.monavocat.Dtos.AvocatDto;
import ma.monavocat.Entities.AvocatEntity;

import java.util.List;

public interface AvocatService {
    AvocatDto ajouterAvocat(AvocatDto avocatDto);
    AvocatDto modifierAvocat(AvocatDto avocatDto);
    boolean delete(AvocatDto avocatDto);
    List<AvocatEntity> afficherListAvocat();
}
