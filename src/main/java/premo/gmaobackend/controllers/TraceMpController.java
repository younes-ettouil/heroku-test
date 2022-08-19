package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import premo.gmaobackend.models.Reclamation;
import premo.gmaobackend.models.TraceMP;
import premo.gmaobackend.repositories.TraceMpRpository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = ("*"))
@RestController
public class TraceMpController {

    @Autowired
    public TraceMpRpository traceMpRpository;

    @PostMapping("/addTraceMp")
    TraceMP newTraceMp(@RequestBody TraceMP newTraceMp){
        return traceMpRpository.save(newTraceMp);
    }

    @GetMapping("/TraceMps")
    List<TraceMP> getall(){
        return traceMpRpository.findAll();
    }

    @PutMapping("/tracemp/{idt_mp}")
    public ResponseEntity<TraceMP> updateRTraceMP(@PathVariable("idt_mp") long idt_mp, @RequestBody TraceMP traceMP) {
        Optional<TraceMP> traceMPData = traceMpRpository.findById(idt_mp);
        if (traceMPData.isPresent()) {
            TraceMP _traceMP = traceMPData.get();
            _traceMP.setTypet_mp(traceMP.getTypet_mp());
            _traceMP.setDateclou(traceMP.getDateclou());
            _traceMP.setHeured(traceMP.getHeured());
            _traceMP.setHeuref(traceMP.getHeuref());

            return new ResponseEntity<>(traceMpRpository.save(_traceMP), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
}
}
