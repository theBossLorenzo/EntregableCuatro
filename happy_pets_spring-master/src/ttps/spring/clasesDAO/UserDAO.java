package ttps.spring.clasesDAO;

import ttps.spring.model.User;
import org.springframework.stereotype.Repository;
import ttps.spring.interfacesDAO.UserDAOInterface;
import ttps.spring.model.Vet;

import java.util.List;

@Repository
public class UserDAO extends GenericDao<User> implements UserDAOInterface {
	
	public UserDAO() {
        super(User.class);
	}


	@Override
	public List<User> getAllUsers() {
		return this.getEntityManager().createNativeQuery("select user_mail, user_password from Admin union select user_mail, user_password from Owner").getResultList();
	}
}
