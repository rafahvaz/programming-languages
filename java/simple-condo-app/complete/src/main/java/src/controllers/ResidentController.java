package src.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import src.helper.ResidentsHelper;
import src.models.Resident;

import java.lang.reflect.Array;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

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

    @RequestMapping(value = "/resident", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Void> registerResident(@RequestBody LinkedHashMap request){

        ArrayList<Object> list = new ArrayList<Object>();

        for(Object value : request.values()) {
//            String value = (String)val;
            list.add(value);
        }

        Resident newResident = new Resident(
                (Integer)list.get(0),
                (String)list.get(1),
                (String)list.get(2),
                (Integer)list.get(3)
        );

        System.out.println(newResident.getName());

        this.residentsHelper.addResident(newResident);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/").buildAndExpand().toUri();
        return ResponseEntity.created(location).build();
    }

    @RequestMapping(value = "/delete-resident/{residentId}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Void> deleteResident(@PathVariable String residentId){

        this.residentsHelper.deleteResident(Integer.parseInt(residentId));


        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/").buildAndExpand().toUri();

        return ResponseEntity.created(location).build();
    }

}
