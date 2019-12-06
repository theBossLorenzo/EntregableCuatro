package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.interfacesDAO.UserDAOInterface;
import ttps.spring.model.Pet;
import ttps.spring.model.User;
import ttps.spring.service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
    UserService userService;
    
    @PutMapping("/login")
    public ResponseEntity<User> listAllPets(@RequestBody User user ){
        Boolean users = userService.getUser(user);   
        if(!users){
            return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }


}