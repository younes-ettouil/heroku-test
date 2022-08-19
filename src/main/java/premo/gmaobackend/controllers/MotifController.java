package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import premo.gmaobackend.models.Motif;
import premo.gmaobackend.repositories.MotifRepository;

import java.util.List;

@RestController
public class MotifController {
    @Autowired
    public MotifRepository motifRepository;

    @GetMapping("/motifs")
    List<Motif> all(){
        return motifRepository.findAll();
    }


}

