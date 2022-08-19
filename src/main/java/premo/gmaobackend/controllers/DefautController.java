package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import premo.gmaobackend.models.TypeDefaut;
import premo.gmaobackend.repositories.DefautRepository;

import java.util.List;

@CrossOrigin(origins = "*")

@RestController
public class DefautController {
    @Autowired
    private DefautRepository defautRepository;
    @GetMapping("/defaut")
    List<TypeDefaut> getall(){
        return defautRepository.findAll();
    }


//    @GetMapping("/defaut/{No_inve}")
//    public List<TypeDefaut> getByNo_inve(@PathVariable String No_inve) {
//
//        return defautRepository.getByNo_inve(No_inve);
//    }
}