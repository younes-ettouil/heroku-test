package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import premo.gmaobackend.models.MotifTm;
import premo.gmaobackend.models.Reclamation;
import premo.gmaobackend.repositories.MotifTmRepository;

@RestController
public class MotifTmController {
    @Autowired
    public MotifTmRepository motifTmRepository;

    @PostMapping("/addmotiftm")
    MotifTm newMotifTm(@RequestBody MotifTm newMotifTm){
        return motifTmRepository.save(newMotifTm);
    }
}
