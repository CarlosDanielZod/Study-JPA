package hibernate.study.jpa.business;

import javax.persistence.Entity;

@Entity
public class ProgrammerFrontEnd extends Employee {

	@Override
	public double roleBonification() {
		return super.getSalary() * 0.1;
	}
}
