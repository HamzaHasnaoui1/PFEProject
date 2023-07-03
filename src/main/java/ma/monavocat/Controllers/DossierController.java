package ma.monavocat.Controllers;

import ma.monavocat.Dtos.DossierDto;
import ma.monavocat.Entities.DossierEntity;
import ma.monavocat.Services.DossierServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dossier")
public class DossierController {
    private final static Logger LOGGER = LoggerFactory.getLogger(DossierController.class);
    private final DossierServiceImpl dossierServiceImpl;

    public DossierController(DossierServiceImpl dossierServiceImpl) {
        this.dossierServiceImpl = dossierServiceImpl;
    }

    @PostMapping("/ajouterDossier")
    public DossierDto ajouterDossier(@RequestBody DossierDto dto) {
        LOGGER.debug("start method save dto : {} ", dto);
        return dossierServiceImpl.ajouterDossier(dto);
    }

    @PutMapping("/modifierDossier")
    public DossierDto modifierDossier(@RequestBody DossierDto dto) {
        return dossierServiceImpl.modifierDossier(dto);
    }
    @GetMapping("/list")
    public List<DossierEntity> afficherLesDossier() {
        return dossierServiceImpl.afficherListDossier();
    }
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") long id) {
        LOGGER.debug("start method select by id {} ",id);
        DossierDto idcomp =new DossierDto(id);
        return dossierServiceImpl.delete(idcomp);
    }
}
