package ma.monavocat.Services;

import ma.monavocat.Dtos.DossierDto;
import ma.monavocat.Entities.DossierEntity;
import ma.monavocat.Mappers.DossierMapper;
import ma.monavocat.Repository.DossierRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DossierServiceImpl implements DossierService {
    private final static Logger LOGGER = LoggerFactory.getLogger(DossierServiceImpl.class);
    public static DossierEntity gestionDossierEntity;
    private DossierRepository dossierRepository;
    private DossierMapper dossierMapper = Mappers.getMapper(DossierMapper.class);

    public DossierServiceImpl(DossierRepository dossierRepository) {
        this.dossierRepository = dossierRepository;
    }

    @Override
    public DossierDto save(DossierDto dossierDto) {
        LOGGER.debug("start method save dto : {} ",dossierDto);
        LOGGER.debug("Mapping Dto to Entity : {} ",dossierMapper.dossierDtotoDossierEntity(dossierDto));
        DossierDto re = dossierMapper.dossierEntitytoDossierDto(dossierRepository.save(dossierMapper.dossierDtotoDossierEntity(dossierDto)));
        return re;
    }

    @Override
    public DossierDto update(DossierDto dossierDto) {

        // Recureper l'objet a modifier par numero dossier
        DossierEntity dossierEntityAModifier = dossierRepository.findByNumeroDossier(dossierDto.getNumeroDossier()).get();

        //Verification si un Objet avec le meme numero de dossier existe
        if (Objects.nonNull(dossierEntityAModifier)) {
            dossierEntityAModifier = dossierMapper.dossierDtotoDossierEntity(dossierDto);
            return dossierMapper.dossierEntitytoDossierDto(dossierRepository.save(dossierEntityAModifier));
        }

        return null;
    }

    @Override
    public Boolean delete(DossierDto dossierDto) {
        return null;
    }

    @Override
    public List<DossierDto> selectAll() {
        return null;
    }
    @Override
    public List<DossierEntity> afficherListDossier() {
        return  dossierRepository.findAll();
    }




}