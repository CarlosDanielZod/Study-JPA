package hibernate.study.jpa.execute;

import hibernate.study.jpa.business.ProgrammerBackEnd;
import hibernate.study.jpa.business.DAO.ProgrammerBackEndDAO;

public class Execute {

	public static void main (String[] args) {
		
		ProgrammerBackEnd backEnd = new ProgrammerBackEnd();
		
		backEnd.setName("Carlos Daniel");
		backEnd.setDescription("Carlos is developer back-end");
		backEnd.setSalary(3000.0d);
		
		ProgrammerBackEndDAO backEndDAO = new ProgrammerBackEndDAO();
//		**Insert Object
		backEndDAO.insert(backEnd);
		
		//**Find Object to Update and Delete
//		ProgrammerBackEnd updateBackEnd = backEndDAO.find(6);
		
		//**Update Object
//		double salary = updateBackEnd.getSalary() + updateBackEnd.calcBonification();
//		updateBackEnd.setSalary(salary);
//		backEndDAO.update(updateBackEnd);
//		
		//**Delete Object
//		backEndDAO.delete(6);
		
		//** Find All Objects
//		List<ProgrammerBackEnd> listBackEnd = backEndDAO.findAll();
//		System.out.println(listBackEnd.get(0).getName());
//		
	}
}
