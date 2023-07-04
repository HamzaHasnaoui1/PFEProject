package ma.monavocat.Controllers;

import ma.monavocat.Dtos.FactureDto;
import ma.monavocat.Entities.FactureEntity;
import ma.monavocat.Services.FactureServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facture")
public class FactureController {
    private final static Logger LOGGER = LoggerFactory.getLogger(TribunalController.class);
    @Autowired
    private final FactureServiceImpl factureServiceImpl;

    public FactureController(FactureServiceImpl factureServiceImpl) {
        this.factureServiceImpl = factureServiceImpl;
    }
    @PostMapping()
    public FactureEntity creerFacture(@RequestBody FactureDto factureDto) {
        return factureServiceImpl.creerFacture(factureDto);
    }
}