package ma.monavocat.Controllers;

import ma.monavocat.Services.DossierServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dossierClient")
public class DossierClientController extends DossierController{
    public DossierClientController(DossierServiceImpl dossierServiceImpl) {
        super(dossierServiceImpl);
    }
}
