package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import premo.gmaobackend.models.CommandeSpeciale;
import premo.gmaobackend.models.Reclamation;
import premo.gmaobackend.repositories.CommandeSpecialeRepository;

import java.util.List;

@CrossOrigin(origins = "*")

@RestController
public class CommandeSpecialeController {
    @Autowired
    public CommandeSpecialeRepository commandeSpecialeRepository;

    @PostMapping("/addCommande")
    CommandeSpeciale newCommandeSpeciale(@RequestBody CommandeSpeciale newCommandeSpeciale){
        return commandeSpecialeRepository.save(newCommandeSpeciale);
    }

    @GetMapping("/commandes")
    List<CommandeSpeciale> getall(){
        return commandeSpecialeRepository.findAll();
    }

}
