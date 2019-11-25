package ttps.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ttps.spring.clasesDAO.UserDAO;
import ttps.spring.interfacesDAO.PetDAOInterface;
import ttps.spring.interfacesDAO.UserDAOInterface;
import ttps.spring.model.Admin;

public class TestSpringSimple {
   public static void main(String[] args) {
	   AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

	   //registra una o más componentes que serán procesadas

	   ctx.register(ttps.spring.config.PersistenceConfig.class);

	   //Busca clases anotadas en el paquete base pasado por parámetro

	   ctx.scan("ttps");

	   ctx.refresh();

	   UserDAOInterface userDAO = ctx.getBean("userDAO", UserDAOInterface.class);
	   PetDAOInterface petDAO = ctx.getBean("petDAO", PetDAOInterface.class);
	   
	   Admin admin1 = new Admin("Lorenzo", "1234", "Lorenzo", "4273723295", "lorenzoCarlos@yahoo.com");

	   userDAO.persist(admin1);
	   Long numero = new Long(1);
	   System.out.println(petDAO.recuperarTodasLasMascotasParaUnOwner(numero).size());
	   System.out.println(userDAO.getAllUsers().size());
	   
	   
	   }
	}
