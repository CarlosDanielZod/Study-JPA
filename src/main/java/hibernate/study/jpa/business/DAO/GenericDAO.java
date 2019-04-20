package hibernate.study.jpa.business.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import hibernate.study.jpa.configuration.ConfigJPA;

public abstract class GenericDAO<T> implements InterfaceDAO<T> {

	private EntityManager em = new ConfigJPA().getPersistFactory();
	
	public abstract Class<T> getType();

	public T find(int id) {
		T entity = em.find(getType(), id);
		return entity;
	}

	public List<T> findAll() {		
		List<T> resultList = new ArrayList<T>();
		Query query = em.createNativeQuery("SELECT * FROM " + getType().getSimpleName());
			resultList = (List<T>) query.getResultList();
		return resultList;
	}

	public void insert(T entity) {
		
		em.getTransaction().begin();
		
		try {
			em.persist(entity);
			em.getTransaction().commit();
		} catch (PersistenceException e) {
			em.getTransaction().rollback();
			e.getMessage();
		}finally {
			em.close();
		}
	}

	public void update(T entity) {
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		} catch (PersistenceException e) {
			em.getTransaction().rollback();
			e.getMessage();
		}finally {
			em.close();
		}
	}

	public void delete(int id) {
		T entity = em.find(getType(), id);
		
		em.getTransaction().begin();
		try {
			em.remove(entity);
			em.getTransaction().commit();
		} catch (PersistenceException e) {
			em.getTransaction().rollback();
			e.getMessage();
		}finally {
			em.close();
		}
	}

}
