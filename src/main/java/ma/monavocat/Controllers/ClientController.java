package ma.monavocat.Controllers;

import ma.monavocat.Dtos.ClientDto;
import ma.monavocat.Entities.ClientEntity;
import ma.monavocat.Services.ClientServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final static Logger LOGGER= LoggerFactory.getLogger(TribunalController.class);
    @Autowired
    private final ClientServiceImpl clientService;

    public ClientController(ClientServiceImpl clientService) {
        this.clientService = clientService;
    }
    @PostMapping("/ajouterClient")
    public ClientDto ajouterClient(@RequestBody ClientDto clientDto) {
        LOGGER.debug("start method save dto : {} ", clientDto);
        return clientService.ajouterClient(clientDto);
    }

    @PutMapping("/modifierClient")
    public ClientDto modifierAvocat(@RequestBody ClientDto clientDto) {
        return clientService.modifierClient(clientDto);
    }
    @GetMapping("/list")
    public List<ClientEntity> afficherLesClients() {
        return clientService.afficherListClient();
    }
    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") long id) {
        LOGGER.debug("start method select by id {} ",id);
        ClientDto idcomp =new ClientDto(id);
        return clientService.delete(idcomp);
    }
}
