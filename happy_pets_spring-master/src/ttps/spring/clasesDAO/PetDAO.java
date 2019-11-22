package ttps.spring.clasesDAO;


import ttps.spring.model.Pet;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class PetDAO extends GenericDao<Pet> {

	public PetDAO() {
		super(Pet.class);
	}
	public Pet recuperarPet(long l) {
			Query consulta = EMF.getEMF().createEntityManager().createQuery("select p from Pet v where p.pet_id =?1");
			consulta.setParameter(1, l);
			Pet pet = (Pet)consulta.getSingleResult();
			return pet;
	}
}
