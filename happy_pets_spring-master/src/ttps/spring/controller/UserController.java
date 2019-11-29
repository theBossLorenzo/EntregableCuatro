package ttps.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ttps.spring.service.UserService;

@RestController
@RequestMapping
public class UserController {
	
    
    UserService userService;


}