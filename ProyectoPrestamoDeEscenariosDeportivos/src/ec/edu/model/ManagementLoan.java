package ec.edu.model;

import java.util.ArrayList;
import java.util.Calendar;

public class ManagementLoan {
	private String routeActorsFile="Resources/Files/Prestamos.txt";
	private ArrayList<Loan> loans;
	private int contId;

	public ManagementLoan() {
		loans= new ArrayList<>();
		contId=0;
		
	}
	
	public void addLoan(Loan loan) {
		contId++;		
		loan.setId(""+contId);
		loans.add(loan);		
	}
	
	
	public int searchLoan(Loan loanS) {
		for (int i = 0; i < loans.size(); i++) {
			if (loanS.getId().equals(loans.get(i).getId())) {
				return i;
			}
		}		
		return -1;
	}
	
	
	
	public ArrayList<Loan> loadsDay(Calendar date){
		for (Loan loan : loans) {
			if (date.get(Calendar.DAY_OF_MONTH)==loan.getDate().get(Calendar.DAY_OF_MONTH)&&date.get(Calendar.MONTH)==loan.getDate().get(Calendar.MONTH)) {
				
			}
		}
		
		return null;
	}
	
	
	// in this part I comppare a hour with de array for nkow if have one loan in this hour
	public boolean hourLoan(Calendar date,Stage stage) {
		for (Loan loan : loans) {
			if (date.get(Calendar.DAY_OF_MONTH)==loan.getDate().get(Calendar.DAY_OF_MONTH)&&date.get(Calendar.MONTH)==loan.getDate().get(Calendar.MONTH)
					&&date.get(Calendar.YEAR)==loan.getDate().get(Calendar.YEAR) &&date.get(Calendar.HOUR_OF_DAY)==loan.getDate().get(Calendar.HOUR_OF_DAY)&&stage.equals(loan.getStage())) {
				return true;
			}
			
		}
		return false;
	}
	
	
	//search available times for date and stage
	public ArrayList<Integer> availableTimeStage(Calendar date,Stage stage){
		ArrayList<Integer> out= new ArrayList<>();
			
		ArrayList<Loan> up= loadsDay(date);
		
		for (int i = 9; i < 13; i++) {
			date.set(Calendar.HOUR_OF_DAY,i);
			if (!hourLoan(date,stage)) {
				out.add(i);
				
			}
		}		
		
		for (int i = 16; i < 20; i++) {
			date.set(Calendar.HOUR_OF_DAY,i);
			if (!hourLoan(date,stage)) {
				out.add(i);
				
			}			
		}		
		return out;
	}
	
	
	

}
