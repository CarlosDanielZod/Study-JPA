
import hibernate.study.jpa.business.ProgrammerBackEnd;
import hibernate.study.jpa.business.ProgrammerFrontEnd;
import hibernate.study.jpa.business.DAO.ProgrammerBackEndDAO;
import hibernate.study.jpa.business.DAO.ProgrammerFrontEndDAO;

public class ExecutePersist {

	public static void main (String[] args) {
		
		ProgrammerFrontEndDAO progFront = new ProgrammerFrontEndDAO();
		ProgrammerFrontEnd FE = progFront.find(5);
		System.out.println("Bonificação do Programador Front-End: " + FE.calcBonification());
		
		ProgrammerBackEndDAO progBack = new ProgrammerBackEndDAO();
		ProgrammerBackEnd BE = progBack.find(1);
		System.out.println("Bonificação do Programador Back-End: " + BE.calcBonification());
	}
}
