package ma.monavocat.Controllers;

import ma.monavocat.Dtos.AvocatDto;
import ma.monavocat.Services.AvocatServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avocat")
public class AvocatController {
    private final static Logger LOGGER= LoggerFactory.getLogger(TribunalController.class);
    @Autowired
    private final AvocatServiceImpl avocatService;
    public AvocatController(AvocatServiceImpl avocatService) {
        this.avocatService = avocatService;
    }

    @PostMapping("/ajouterAvocat")
    public Long ajouterAvocat(@RequestBody AvocatDto dto) {
        LOGGER.debug("start method save dto : {} ", dto);
        return avocatService.ajouterAvocat(dto);
    }

    @PutMapping("/modifierAvocat")
    public Long modifierAvocat(@RequestBody AvocatDto dto) {
        return avocatService.modifierAvocat(dto);
    }
    @GetMapping("/list")
    public List<AvocatDto> afficherLesDossier() {
        return avocatService.afficherListAvocat();
    }
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") long id) {
        LOGGER.debug("start method select by id {} ",id);
        AvocatDto idcomp =new AvocatDto(id);
        return avocatService.delete(idcomp);
    }
}
