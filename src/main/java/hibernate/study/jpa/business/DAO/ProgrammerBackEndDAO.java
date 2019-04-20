package hibernate.study.jpa.business.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import hibernate.study.jpa.business.ProgrammerBackEnd;
import hibernate.study.jpa.configuration.ConfigJPA;

public class ProgrammerBackEndDAO extends GenericDAO<ProgrammerBackEnd> {

	private EntityManager em = new ConfigJPA().getPersistFactory();
	
	@Override
	public Class<ProgrammerBackEnd> getType() {
		return ProgrammerBackEnd.class;
	}

	@Override
	public void insert(ProgrammerBackEnd entity) {
		super.insert(entity);
	}
	
	@Override
	public ProgrammerBackEnd find(int id) {
		return super.find(id);
	}
	
	@Override
	public List<ProgrammerBackEnd> findAll() {
		return super.findAll();
	}
	
	@Override
	public void delete(int id) {
		super.delete(id);
	}
	
	@Override
	public void update(ProgrammerBackEnd entity) {
		super.update(entity);
	}
}
