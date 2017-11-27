package src.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import src.helper.ResidentsHelper;
import src.models.Resident;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class ResidentController extends ControllerTemplate {

    private ResidentsHelper residentsHelper = ResidentsHelper.getInstance();

    @CrossOrigin(origins = "localhost:8000")
    @RequestMapping("/residents")
    public ArrayList<Resident> resident() {
        return residentsHelper.getResidentsList();
    }

    @RequestMapping("/resident/{residentId}")
    public Object getResident(@PathVariable("residentId") int residentId) {
        Resident choosenResident = null;

        for(Object r : residentsHelper.getResidentsList().toArray()) {
            Resident resident = (Resident) r;
            if(resident.getId() == residentId) {
                choosenResident = resident;
            }
        }

        return choosenResident != null ? choosenResident : "Sem resultados";

    };

}
