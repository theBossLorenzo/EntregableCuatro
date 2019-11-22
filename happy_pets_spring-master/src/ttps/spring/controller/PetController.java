package ttps.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ttps.spring.model.Pet;
import ttps.spring.service.PetService;

@Controller
public class PetController {
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody Pet pet) {
        System.out.println("Creando a la mascota" + pet.getName());
        if (PetService.isPetExist(pet)) {
            System.out.println("Ya existe una mascota con nombre " + pet.getName());
            return new ResponseEntity<Pet>(HttpStatus.CONFLICT); //Código de respuesta 409
        }
        PetService.savePet(pet);
        return new ResponseEntity<Pet>(HttpStatus.CREATED);
    }

}
