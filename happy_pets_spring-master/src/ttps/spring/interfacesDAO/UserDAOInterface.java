package ttps.spring.interfacesDAO;
import ttps.spring.model.User;

import java.util.List;

public interface UserDAOInterface extends GenericDAOInterface<User> {

    public List<User> getAllUsers();

}
