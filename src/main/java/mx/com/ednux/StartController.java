package mx.com.ednux;

import lombok.extern.slf4j.Slf4j;
import mx.com.ednux.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class StartController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String started(Model model){
        var personas = personaService.getPersons();
        log.info("Execute rest controller");
        model.addAttribute("personas", personas);
        return "index";
    }
}
