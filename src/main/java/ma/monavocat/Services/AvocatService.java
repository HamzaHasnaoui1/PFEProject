package ma.monavocat.Services;

import ma.monavocat.Dtos.AvocatDto;

import java.util.List;

public interface AvocatService {
    Long ajouterAvocat(AvocatDto avocatDto);
    Long modifierAvocat(AvocatDto avocatDto);
    boolean delete(AvocatDto avocatDto);
    List<AvocatDto> afficherListAvocat();
}
