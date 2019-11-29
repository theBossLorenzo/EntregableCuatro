package ttps.spring.service;

import ttps.spring.clasesDAO.UserDAO;
import ttps.spring.model.User;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	UserDAO dao;
	
    public List<User> getAllUsers(){
        return new UserDAO().getAllUsers();
    }
}
