package hibernate.study.jpa.business.DAO;

import java.util.List;

import hibernate.study.jpa.business.ProgrammerFrontEnd;

public class ProgrammerFrontEndDAO extends GenericDAO<ProgrammerFrontEnd> {

	@Override
	public Class<ProgrammerFrontEnd> getType() {
		return ProgrammerFrontEnd.class;
	}

	@Override
	public void insert(ProgrammerFrontEnd entity) {
		super.insert(entity);
	}
	
	@Override
	public ProgrammerFrontEnd find(int id) {
		return super.find(id);
	}
	
	@Override
	public List<ProgrammerFrontEnd> findAll() {
		return super.findAll();
	}
	
	@Override
	public void update(ProgrammerFrontEnd entity) {
		super.update(entity);
	}
	
	@Override
	public void delete(int id) {
		super.delete(id);
	}
}
