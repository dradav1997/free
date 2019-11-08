package Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import ec.edu.model.Actor;
import ec.edu.model.Loan;
import ec.edu.model.ManagementLoan;
import ec.edu.model.Stage;
import ec.edu.model.types.Gender;
import ec.edu.model.types.TypesOfActors;

class Test {
	ManagementLoan mng= new ManagementLoan();

	@org.junit.jupiter.api.Test
	void test() {
		Actor ac= new Actor("1", "12", "david", Calendar.getInstance(), Gender.MASCULINO, "311516652", "@",TypesOfActors.ESTUDIANTES );
		Stage stage= new Stage("1","cancha1", "hola", "aceptable");
		
		Loan tes= new Loan();
		tes.addActor(ac);
		tes.setId("1");
		tes.setStage(stage);
		
		Calendar date= Calendar.getInstance();		
		date.set(2019, 10, 4, 17, 0);
		tes.setDate(date);
		
		mng.addLoan(tes);
		
		
		
		
		fail("Not yet implemented");
	}

}
