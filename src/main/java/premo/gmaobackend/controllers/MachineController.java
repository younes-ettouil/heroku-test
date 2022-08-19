package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import premo.gmaobackend.models.Machine;
import premo.gmaobackend.repositories.MachineRepository;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class MachineController {
    @Autowired
    private MachineRepository machineRepository;

    @GetMapping("/machine")
    List<Machine> getall(){
        return machineRepository.findAll();
    }

//    @GetMapping("/machine/{Id_Ligne}")
//    public List<Machine> getById_Ligne(@PathVariable String Id_Ligne){
//
//        return machineRepository.getReclamationMById_Ligne(Id_Ligne);
//    }

    @GetMapping("/machine/{Id_Ligne}")
    public List<Machine> getMachineId_Ligne(@PathVariable String Id_Ligne){
        return machineRepository.getById_Ligne(Id_Ligne);
    }
}