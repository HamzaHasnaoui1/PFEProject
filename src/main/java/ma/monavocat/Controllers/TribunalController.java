package ma.monavocat.Controllers;

import ma.monavocat.Dtos.TribunalDto;
import ma.monavocat.Entities.TribunalEntity;
import ma.monavocat.Services.TribunalServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tribunal")
public class TribunalController {
    private final static Logger LOGGER= LoggerFactory.getLogger(TribunalController.class);
    @Autowired
    private final TribunalServiceImpl tribunalServiceImpl;

    public TribunalController(TribunalServiceImpl tribunalServiceImpl) {
        this.tribunalServiceImpl = tribunalServiceImpl;
    }

    @PostMapping()
    public TribunalEntity creerTribunal(@RequestBody TribunalDto tribunalDto) {
        return tribunalServiceImpl.creerTribunal(tribunalDto);
    }

    @GetMapping("/list")
    public List<TribunalEntity> afficherLesTribunaux() {
        return tribunalServiceImpl.afficherListTribunal();
    }

    @PutMapping
    public TribunalEntity updateTribunal(@RequestBody TribunalDto tribunalDto) {
        return tribunalServiceImpl.modifierTribunal(tribunalDto);
    }
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") long id) {
        LOGGER.debug("start method select by id {}",id);
        TribunalDto idcomp =new TribunalDto
                (id);
        return tribunalServiceImpl.supprimerTribunal(idcomp);
    }


}
