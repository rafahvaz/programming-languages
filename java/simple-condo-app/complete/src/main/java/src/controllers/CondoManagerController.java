package src.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import src.models.CondoManager;

@RestController
public class CondoManagerController extends ControllerTemplate {

    @RequestMapping("/manager")
    public CondoManager condoManager() {
        return new CondoManager(
                1,
               "Mario Toledo",
               "22424450498");
    }

}
