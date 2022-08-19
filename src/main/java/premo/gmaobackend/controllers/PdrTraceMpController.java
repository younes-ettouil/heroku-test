package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import premo.gmaobackend.models.PdrTraceMp;
import premo.gmaobackend.repositories.PdrTraceMpRepository;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PdrTraceMpController {
    @Autowired
    public PdrTraceMpRepository pdrTraceMpRepository;

    @PostMapping("/pdtracemp")
    PdrTraceMp newPdrTraceMp(@RequestBody  PdrTraceMp newPdrTraceMp){
        return pdrTraceMpRepository.save(newPdrTraceMp);
    }


    @GetMapping("pdtracemps")
    List<PdrTraceMp> getall(){
        return pdrTraceMpRepository.findAll();
    }
}
