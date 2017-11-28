package src.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import src.helper.ResidentsHelper;
import src.models.Resident;

import javax.xml.ws.Response;
import java.lang.reflect.Array;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
public class ResidentController extends ControllerTemplate {

    private ResidentsHelper residentsHelper = ResidentsHelper.getInstance();

    @CrossOrigin(origins = "localhost:4200")
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

        this.residentsHelper.addResident(request);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/").buildAndExpand().toUri();
        return ResponseEntity.created(location).build();
    }

    @RequestMapping(value = "/delete-resident/{residentId}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Void> deleteResident(@PathVariable String residentId){

        this.residentsHelper.deleteResident(Integer.parseInt(residentId));

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/").buildAndExpand().toUri();

        return ResponseEntity.created(location).build();
    }

    @RequestMapping(value = "/check-bill/{residentId}", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Void> checkBill(@PathVariable String residentId) {

        this.residentsHelper.checkBill(Integer.parseInt(residentId));

         URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/").buildAndExpand().toUri();

        return ResponseEntity.created(location).build();
    }

}
