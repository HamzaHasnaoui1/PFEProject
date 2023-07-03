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

    @PostMapping("/save")
    public DossierDto save(@RequestBody DossierDto dto) {
        LOGGER.debug("start method save dto : {} ", dto);
        return dossierServiceImpl.save(dto);
    }

    @PutMapping("/update")
    public DossierDto update(@RequestBody DossierDto dto) {
        return dossierServiceImpl.update(dto);
    }
    @GetMapping("/list")
    public List<DossierEntity> afficherLesDossier() {
        return dossierServiceImpl.afficherListDossier();
    }
    @DeleteMapping("/{id}/{code}")
    public Boolean deleteById(@PathVariable("id") long id,@PathVariable("code") String code) {
        LOGGER.debug("start method select by id {} , code {} ",id,code);
        DossierDto idcomp =new DossierDto(id,code);
        return dossierServiceImpl.delete(idcomp);
    }
}
