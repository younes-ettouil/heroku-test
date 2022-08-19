package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import premo.gmaobackend.models.LigneInter;
import premo.gmaobackend.models.LigneProduction;
import premo.gmaobackend.repositories.LigneProductionRepository;
import premo.gmaobackend.repositories.LigneRepository;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class LigneController {
    @Autowired
    private LigneRepository ligneRepository;

    @Autowired
    private LigneProductionRepository ligneProductionRepository;




    @GetMapping("/ligne/{Id_Inter}")
    public List<LigneInter> getById_Inter(@PathVariable String Id_Inter){

        return ligneRepository.getById_Inter(Id_Inter);

    }

    @GetMapping("/ligne")
    public List<LigneProduction> getById_Inter(){

        return ligneProductionRepository.findAll();

    }

}
