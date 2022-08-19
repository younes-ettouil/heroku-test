package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import premo.gmaobackend.models.Pdr;
import premo.gmaobackend.models.PdrTrace;
import premo.gmaobackend.models.Reclamation;
import premo.gmaobackend.repositories.PdrRepository;
import premo.gmaobackend.repositories.PdrTraceRepository;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class PdrController {

    @Autowired
    public PdrRepository pdrRepository;
    public PdrTraceRepository pdrTraceRepository;

    @GetMapping("/pdrs")
    List<Pdr> getall() {
        return pdrRepository.findAll();
    }

    @PutMapping("/PDR/{Id}")
    public ResponseEntity<PdrTrace> addPdrTrace(@PathVariable("Id_P_T") long Id_P_T, @RequestBody PdrTrace pdrTrace) {
        Optional<PdrTrace> pdrTraceData = pdrTraceRepository.findById(Id_P_T);
        if (pdrTraceData.isPresent()) {
            PdrTrace _pdrTrace = pdrTraceData.get();
            _pdrTrace.setId_P_T(pdrTrace.getId_P_T());
            _pdrTrace.setQte(pdrTrace.getQte());
            return new ResponseEntity<>(pdrTraceRepository.save(_pdrTrace), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
}