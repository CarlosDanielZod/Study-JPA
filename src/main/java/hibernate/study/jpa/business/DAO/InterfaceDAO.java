package hibernate.study.jpa.business.DAO;

import java.util.List;

public interface InterfaceDAO<T> {
	
	public T find(int id);
	
	public List<T> findAll();
	
	public void insert(T entity);
	
	public void update(T entity);
	
	public void delete(int id);
	
}
