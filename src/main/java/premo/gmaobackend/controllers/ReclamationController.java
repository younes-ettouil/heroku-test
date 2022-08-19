package premo.gmaobackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import premo.gmaobackend.models.LigneInter;
import premo.gmaobackend.models.PdrTrace;
import premo.gmaobackend.models.Reclamation;
import premo.gmaobackend.repositories.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class ReclamationController {
    @Autowired
    private ReclamationRepository reclamationRepository;
    @Autowired
    private PdrTraceRepository pdrTraceRepository;
    @Autowired
    private LigneRepository ligneRepository;


    @GetMapping("/reclamation/notification/{id}")
    List<Reclamation> reclamationsNotifList(@PathVariable("id") String id){
        List<LigneInter>  list = ligneRepository.getById_Inter(id);
        List<Reclamation> listRec = new ArrayList<Reclamation>();
        for(int i=0;i<list.size();i++){
            listRec.addAll(reclamationRepository.getReclamationNotification(list.get(i).ligneProduction.getNom_ligne()));
            System.out.println(list.get(i).ligneProduction.getNom_ligne());
        }

        return listRec;

    }

    @GetMapping("/reclamation/nonfait/{id}")
    List<Reclamation> reclamationsNonFait(@PathVariable("id") String id){
        List<LigneInter>  list = ligneRepository.getById_Inter(id);
        List<Reclamation> listRec = new ArrayList<Reclamation>();
        for(int i=0;i<list.size();i++){
            listRec.addAll(reclamationRepository.getReclamationNonFait(list.get(i).ligneProduction.getNom_ligne()));
            System.out.println(list.get(i).ligneProduction.getNom_ligne());
        }

        return listRec;

    }



    @PostMapping("/reclamation")
    Reclamation newReclamation(@RequestBody Reclamation newReclamation){
        return reclamationRepository.save(newReclamation);
    }
    @GetMapping("/reclamations")
    List<Reclamation> all(){
        return reclamationRepository.findAll();
    }
    @PutMapping("/reclamations/{Id}")
    public ResponseEntity<Reclamation> updateReclamation(@PathVariable("Id") long Id, @RequestBody Reclamation reclamation) {
        Optional<Reclamation> reclamationData = reclamationRepository.findById(Id);
        if (reclamationData.isPresent()) {
            Reclamation _reclamation = reclamationData.get();
            _reclamation.setMatinter(reclamation.getMatinter());
            _reclamation.setTypeinte(reclamation.getTypeinte());
            _reclamation.setType_Tache(reclamation.getType_Tache());
            _reclamation.setId_PDR(reclamation.getId_PDR());
            _reclamation.setEtatP(reclamation.getEtatP());
            _reclamation.setObservation(reclamation.getObservation());
            _reclamation.setCloture(reclamation.getCloture());
            _reclamation.setDate_ReelV2(reclamation.getDate_ReelV2());
            _reclamation.setQteconsom(reclamation.getQteconsom());
            _reclamation.setHeureD(reclamation.getHeureD());
            _reclamation.setHeureF(reclamation.getHeureF());
            addPdrTrace(_reclamation.getId(), _reclamation.getId_PDR(), _reclamation.getQteconsom());
            return new ResponseEntity<>(reclamationRepository.save(_reclamation), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }



    }

    public void addPdrTrace(long idrec, String idpdr, int qte) {
        Optional<PdrTrace> pdrTraceData = pdrTraceRepository.getPdrTraceById_Trace(idrec);

        PdrTrace _pdrTrace;

        if(pdrTraceData.isPresent()){
            _pdrTrace = pdrTraceData.get();
            _pdrTrace.setId_P_T(_pdrTrace.getId_P_T());
            _pdrTrace.setId_PDR(_pdrTrace.getId_PDR());
            _pdrTrace.setQte(_pdrTrace.getQte());
            _pdrTrace.setId_Trace(_pdrTrace.getId_Trace());
            pdrTraceRepository.updatePdrTrace(idpdr, qte, (int)idrec, _pdrTrace.getId_P_T());
            System.out.println("tupdate");

        }
        else{
            _pdrTrace = new PdrTrace();
            _pdrTrace.setQte(qte);
            _pdrTrace.setId_Trace((int)idrec);
            _pdrTrace.setId_PDR(idpdr);
            pdrTraceRepository.save(_pdrTrace);
            System.out.println("tajouta");

        }



    }

    @GetMapping("/reclamations/{Id}")
    public ResponseEntity<Reclamation> findReclamation(@PathVariable("Id") long Id) {
        Optional<Reclamation> reclamationData = reclamationRepository.findById(Id);
        return  new ResponseEntity<>(reclamationData.get(),HttpStatus.OK);
    }


    @GetMapping("/reclamation/{Id_Ligne}")
    public List<Reclamation> getrec(@PathVariable String Id_Ligne){
       return reclamationRepository.getReclamationById_Ligne(Id_Ligne);

    }


    @GetMapping("/pannesnr")
    List<Reclamation> allpr(){
        return reclamationRepository.getReclamation();
    }


}
