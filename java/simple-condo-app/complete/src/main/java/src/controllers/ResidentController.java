package src.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import src.models.Resident;

@RestController
public class ResidentController extends ControllerTemplate {

    @RequestMapping("/resident")
    public Resident resident() {
        return new Resident(
                this.counter.incrementAndGet(),
               "Residente X",
               "123431412",
               1);
    }
}
