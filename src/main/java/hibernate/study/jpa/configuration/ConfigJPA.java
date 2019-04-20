package hibernate.study.jpa.configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConfigJPA {

	private EntityManager em;
	
	public EntityManager getPersistFactory() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-jpa-study");
		return em = emf.createEntityManager();
	}
}
