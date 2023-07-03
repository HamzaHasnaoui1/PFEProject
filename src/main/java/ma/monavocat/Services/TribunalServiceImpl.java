package ma.monavocat.Services;

import ma.monavocat.Dtos.TribunalDto;
import ma.monavocat.Entities.TribunalEntity;
import ma.monavocat.Mappers.TribunalMapper;
import ma.monavocat.Repository.TribunalRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TribunalServiceImpl implements TribunalService {

    private final TribunalRepository tribunalRepository;
    private final TribunalMapper tribunalMapper = Mappers.getMapper(TribunalMapper.class);

    public TribunalServiceImpl(TribunalRepository tribunalRepository) {
        this.tribunalRepository = tribunalRepository;
    }


    public TribunalEntity creerTribunal (TribunalDto tribunalDto){
        TribunalEntity tribunalEntity = tribunalMapper.tribunalDtoToTribunalEntity(tribunalDto);
        return tribunalRepository.save(tribunalEntity) ;
    }

    public List<TribunalEntity> afficherListTribunal () {
        return  tribunalRepository.findAll();
    }

    @Override
    public TribunalEntity modifierTribunal(TribunalDto s) {
      Optional<TribunalEntity> tribunalAModifer = tribunalRepository.findById(s.getId());
        if (tribunalAModifer.isPresent()) {
            TribunalEntity tribunalEntity = tribunalAModifer.get();
            tribunalEntity = tribunalMapper.tribunalDtoToTribunalEntity(s);
            tribunalRepository.save(tribunalEntity);
            return tribunalEntity;
        }
        return null;

    }

    @Override
    public Boolean supprimerTribunal(TribunalDto s) {
        return null;
    }

}