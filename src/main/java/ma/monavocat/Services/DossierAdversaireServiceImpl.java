package ma.monavocat.Services;

import ma.monavocat.Dtos.DossierAdversaireDto;
import ma.monavocat.Dtos.DossierDto;
import ma.monavocat.Entities.DossierAdversaireEntity;
import ma.monavocat.Entities.DossierEntity;
import ma.monavocat.Mappers.DossierAdversaireMapper;
import ma.monavocat.Repository.DossierAdversaireRepository;
import ma.monavocat.Repository.DossierRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DossierAdversaireServiceImpl implements DossierAdversaireService {
    private final static Logger LOGGER = LoggerFactory.getLogger(DossierAdversaireServiceImpl.class);
    public static DossierEntity gestionDossierEntity;
    private DossierAdversaireRepository dossierAdversaireRepository;
    private DossierAdversaireMapper dossierAdversaireMapper = Mappers.getMapper(DossierAdversaireMapper.class);

    public DossierAdversaireServiceImpl(DossierRepository dossierRepository) {
        this.dossierAdversaireRepository = dossierAdversaireRepository;
    }

    @Override
    public DossierAdversaireDto ajouterDossier(DossierAdversaireDto dossierAdversaireDto) {
        LOGGER.debug("start method save dto : {} ", dossierAdversaireDto);
        LOGGER.debug("Mapping Dto to Entity : {} ", dossierAdversaireMapper.dossierAdversaireDtoToDossierAdversaireEntity(dossierAdversaireDto));
        DossierAdversaireDto re = dossierAdversaireMapper.dossierAdversaireEntityToDossierAdversaireDto(dossierAdversaireRepository.save(dossierAdversaireMapper.dossierAdversaireDtoToDossierAdversaireEntity(dossierAdversaireDto)));
        return re;
    }


    @Override
    public boolean delete(DossierAdversaireDto dossierAdversaireDto) {
        LOGGER.debug("start method delete id : {} ", dossierAdversaireDto);
        dossierAdversaireRepository.deleteById((dossierAdversaireMapper.dossierAdversaireDtoToDossierAdversaireEntity(dossierAdversaireDto)).getId());
        return true;
    }

    @Override
    public List<DossierDto> selectAll() {
        return null;
    }

    @Override
    public List<DossierAdversaireEntity> afficherListDossier() {
        return dossierAdversaireRepository.findAll();
    }

}