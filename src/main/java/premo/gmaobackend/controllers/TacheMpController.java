package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import premo.gmaobackend.models.TacheMp;
import premo.gmaobackend.repositories.TacheMpRepository;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TacheMpController {
    @Autowired
    public TacheMpRepository tacheMpRepository;

    @GetMapping("/tachemps/{Id_Ligne}/{Id_Machine}")
    List<TacheMp> getallByIdLigneMachine(@PathVariable("Id_Ligne") String Id_Ligne,@PathVariable("Id_Machine") Long Id_Machine){
        return tacheMpRepository.getTacheMpBy(Id_Ligne,Id_Machine);

    }
}
