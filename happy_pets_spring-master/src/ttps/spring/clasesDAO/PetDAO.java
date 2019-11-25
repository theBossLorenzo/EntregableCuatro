package ttps.spring.clasesDAO;


import ttps.spring.interfacesDAO.PetDAOInterface;
import ttps.spring.model.Pet;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetDAO extends GenericDao<Pet> implements PetDAOInterface {
    public PetDAO() { super(Pet.class);
    }

	public Pet recuperarPet(long l) {
			Query consulta = EMF.getEMF().createEntityManager().createQuery("select p from Pet v where p.pet_id =?1");
			consulta.setParameter(1, l);
			Pet pet = (Pet)consulta.getSingleResult();
			return pet;
	}

    @Override
    public Pet recuperarPet(Long id) {
        return null;
    }

    @Override
    public List<Pet> recuperarTodasLasMascotasParaUnOwner(Long id) {
        //Pasar a HQL
        return this.getEntityManager().createNativeQuery("select * from Pet p where p.owner_id = ?1").setParameter(1, id).getResultList();
    }

    @Override
    public List<Pet> recuperarTodasLasMascotasParaUnVet(Long id) {
        return null;
    }
}
