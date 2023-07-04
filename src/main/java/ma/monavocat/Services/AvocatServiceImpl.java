package ma.monavocat.Services;

import ma.monavocat.Dtos.AvocatDto;
import ma.monavocat.Entities.AvocatEntity;
import ma.monavocat.Mappers.AvocatMapper;
import ma.monavocat.Repository.AvocatRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvocatServiceImpl implements AvocatService{
    private final static Logger LOGGER = LoggerFactory.getLogger(AvocatServiceImpl.class);
    public static AvocatEntity gestionAvocatEntity;
    private AvocatRepository avocatRepository;

    public AvocatServiceImpl(AvocatRepository avocatRepository) {
        this.avocatRepository = avocatRepository;
    }

    private AvocatMapper avocatMapper = Mappers.getMapper(AvocatMapper.class);


    @Override
    public Long ajouterAvocat(AvocatDto dto) {
        LOGGER.debug("start method save dto : {} ", dto);
        LOGGER.debug("Mapping Dto to Entity : {} ", avocatMapper.avocatDtoToAvocatEntity(dto));
        AvocatDto re = avocatMapper.avocatEntityToAvocatDto(avocatRepository.save(avocatMapper.avocatDtoToAvocatEntity(dto)));
        return re.getId();
    }

    public Long modifierAvocat(AvocatDto dto) {
        LOGGER.debug("start method update dto : {}",dto);
        LOGGER.debug("Mapping Dto to Entity : {} ", avocatMapper.avocatDtoToAvocatEntity(dto));
        AvocatDto re = avocatMapper.avocatEntityToAvocatDto(avocatRepository.save(avocatMapper.avocatDtoToAvocatEntity(dto)));
        return re.getId();
    }

    @Override
    public boolean delete(AvocatDto avocatDto) {
        LOGGER.debug("start method delete id : {} ", avocatDto);
        avocatRepository.deleteById((avocatMapper.avocatDtoToAvocatEntity(avocatDto)).getId());
        return true;
    }
    @Override
    public List<AvocatDto> afficherListAvocat() {
        LOGGER.debug("start method select All");
        return avocatMapper.avocatEntityToAvocatDto(avocatRepository.findAll());
    }

}
