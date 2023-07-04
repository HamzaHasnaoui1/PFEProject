package ma.monavocat.Services;

import ma.monavocat.Dtos.FactureDto;
import ma.monavocat.Entities.FactureEntity;
import ma.monavocat.Mappers.FactureMapper;
import ma.monavocat.Repository.FactureRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FactureServiceImpl {
    private final static Logger LOGGER = LoggerFactory.getLogger(TribunalServiceImpl.class);
    private final FactureMapper factureMapper = Mappers.getMapper(FactureMapper.class);
    private final FactureRepository factureRepository;

    public FactureServiceImpl(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    public FactureEntity creerFacture(FactureDto factureDto) {
        FactureEntity factureEntity = factureMapper.factureDtoToFactureEntity(factureDto);
        return factureRepository.save(factureEntity);
    }
}
