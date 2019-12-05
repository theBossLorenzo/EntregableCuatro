package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    UserDAOInterface userService;
    
    @GetMapping("/login/{id}")
    public ResponseEntity<List<User>> listAllPets(@PathVariable("id")long id){
        List<User> users = userService.getAllUsers();
        if(users.isEmpty()){
            return new  ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }


}