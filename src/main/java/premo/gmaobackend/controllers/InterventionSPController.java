package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import premo.gmaobackend.models.InterventionSP;
import premo.gmaobackend.repositories.InterventionSPRepository;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class InterventionSPController {
    @Autowired
    public InterventionSPRepository interventionSPRepository;

    @GetMapping("/interventions")
    List<InterventionSP> getall(){
        return interventionSPRepository.findAll();
    }


    @PostMapping("/addintervention")
    InterventionSP newInterventionSP(@RequestBody InterventionSP newInterventionSP){
        return interventionSPRepository.save(newInterventionSP);
    }


}
