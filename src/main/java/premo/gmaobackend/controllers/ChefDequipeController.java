package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import premo.gmaobackend.models.Intervenant;
import premo.gmaobackend.repositories.UserRepository;

import java.util.List;
@CrossOrigin(origins = "*")

@RestController
public class ChefDequipeController {
    @Autowired
    public UserRepository userRepository;




    @GetMapping("/chefdequipe/{Id_Ligne}")
    public List<Intervenant> getchef(@PathVariable String Id_Ligne){
        return userRepository.getChefDequipe(Id_Ligne);
    }
}
