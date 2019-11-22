package ttps.spring.clasesDAO;

import ttps.spring.model.User;
import org.springframework.stereotype.Repository;
import ttps.spring.interfacesDAO.UserDAOInterface;
import ttps.spring.model.Vet;

@Repository
public class UserDAO extends GenericDao<User> implements UserDAOInterface {
	
	public UserDAO() {
        super(User.class);
	}
	

}
