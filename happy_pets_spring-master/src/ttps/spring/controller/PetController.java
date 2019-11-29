package ttps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ttps.spring.model.Pet;
import ttps.spring.service.PetService;

import java.util.List;

@RestController
@RequestMapping
public class PetController {
    @Autowired
    PetService petService;

    @GetMapping("/pets")
    public ResponseEntity<List<Pet>> listAllPets(){
        List<Pet> pets = petService.getAllPets();
        if(pets.isEmpty()){
            return new  ResponseEntity<List<Pet>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Pet>>(pets, HttpStatus.OK);
    }

}
