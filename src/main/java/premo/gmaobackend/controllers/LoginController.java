package premo.gmaobackend.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import premo.gmaobackend.models.Intervenant;
import premo.gmaobackend.repositories.UserRepository;


@CrossOrigin(origins = "*")
@RestController

public class LoginController {

    @Autowired
    UserRepository userRepository ;

    @PostMapping("/login")
    public ResponseEntity authenticateUser(@RequestBody Intervenant user){

        // Get User Username:
        Intervenant intervenant = userRepository.checkUserUsernameAndPassword(user.getUsername(),user.getPassword());
        if(intervenant.getUsername()!=null && user.getPassword().equals(intervenant.getPassword()) ){
            return new ResponseEntity(intervenant,HttpStatus.OK);
        }
        return new ResponseEntity("NOT FOUND",HttpStatus.NOT_FOUND);

    }

    @GetMapping("/Operateurs")
    public ResponseEntity getOp(@RequestBody Intervenant user){

        Intervenant intervenant = userRepository.checkUserUsernameAndPassword(user.getUsername(),user.getPassword());
      if(user.getUsername().equals(intervenant.getUsername()) && user.getPassword().equals(intervenant.getPassword()) ){

            return new ResponseEntity("WELCOME",HttpStatus.OK);
        }
        return new ResponseEntity("PLEASE LOGIN FOR ACCES TO THIS PAGE",HttpStatus.BAD_REQUEST);

    }



}