package ma.monavocat.Controllers;

import ma.monavocat.Dtos.SecretaireDto;
import ma.monavocat.Entities.SecretaireEntity;
import ma.monavocat.Services.SecretaireServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secretaire")
public class SecretaireController {
    private final static Logger LOGGER= LoggerFactory.getLogger(TribunalController.class);
    @Autowired
    private final SecretaireServiceImpl secretaireService;

    public SecretaireController(SecretaireServiceImpl secretaireService) {
        this.secretaireService = secretaireService;
    }
    @PostMapping()
    public SecretaireEntity ajouterSecretaire(@RequestBody SecretaireDto secretaireDto) {
        return secretaireService.ajouterSecretaire(secretaireDto);
    }
}
