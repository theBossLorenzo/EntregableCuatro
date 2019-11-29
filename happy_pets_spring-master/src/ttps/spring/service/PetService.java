package ttps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ttps.spring.clasesDAO.PetDAO;
import ttps.spring.interfacesDAO.PetDAOInterface;
import ttps.spring.model.Pet;

import java.util.List;

@Service
public class PetService {
	
	@Autowired
	PetDAOInterface petDAO;

    public List<Pet> getAllPets(){
        return petDAO.recuperarTodasLasMascotasParaUnOwner((long) 1);
    }
    public static boolean isPetExist(Pet pet) {
        return true;
    }

    public static void savePet(Pet pet) {
    }
}
