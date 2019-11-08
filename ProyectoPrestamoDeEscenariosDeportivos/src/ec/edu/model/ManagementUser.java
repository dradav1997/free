package ec.edu.model;

import java.util.ArrayList;
import java.util.Calendar;

import ec.edu.model.types.Gender;
import ec.edu.model.types.TypesOfActors;

public class ManagementUser {
	
	private ArrayList<User> users;
	private int cont;

	public ManagementUser() {	
		users= new ArrayList<>();
	}
	
	public void Sort() {
		User temp;		
	    int t= users.size();
	    for (int i = 1; i < t; i++)  {
	         for (int k = t- 1; k >= i; k--){
	                if(users.get(k).getId().compareTo(users.get(k).getId()) < 0){
	                    temp = users.get(k);
	                    users.set(k, users.get(k-1));
	                    users.set(k-1, temp);	                    
	                }
	         }
	    }
	}
	
	public boolean addUsser( String name, String lastName, String identification, String userName, String password) {
		if (users.size()==0) {
			cont=-1;
		}else {
			Sort();
		}			
		
		int cont= Integer.parseInt(users.get(users.size()-1).getId());
		cont++;
		
		if (!exist(identification)) {
			users.add(new User(toString().valueOf(cont), name, lastName, identification, userName, password));			
			return true;
		}else {
			return false;
		}	
	}
	
	public void modifyUser(String id, String name, String lastName, String identification, String userName, String password) {
		users.set(positionObject(id), new User(id, name, lastName, identification, userName, password));
		
	}	
	
	public void deleteActor(String id) {
		for (User user : users) {
			if (user.getId().equals(id)) {
				users.remove(positionObject(id));
			}
		}
	}
	
	
	public int positionObject(String id) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getIdentification().equals(id)) {
				return i;
			}			
		}
		return -1;
	}
	
	public boolean exist(String id) {
		for (User user : users) {
			if (id.compareTo(user.getIdentification())==0) {
				return true;
			}
		}
		
		return false;
	}
	
	public User searchById(String id) {
		if (exist(id)) {
			return users.get(positionObject(id));
		}
		return null;
	}

}
