package ec.edu.model;

import java.util.ArrayList;
import java.util.Calendar;

import ec.edu.model.types.Gender;
import ec.edu.model.types.TypesOfActors;

public class ManagementActor {
	private String routeActorsFile="Resources/Files/Actores.txt";
	private ArrayList<Actor> actors;

	public ManagementActor() {	
		actors= new ArrayList<>();
	}
	
	public boolean addActor(String id, String identification, String name, Calendar birthday, Gender gender, String cellNumber,
			String email, TypesOfActors types) {
		if (!exist(id)) {
			actors.add(new Actor(id, identification, name, birthday, gender, cellNumber, email, types));
			return true;
		}else {
			return false;
		}	
	}
	
	public void modifyActor(String id, String identification, String name, Calendar birthday, Gender gender, String cellNumber,
			String email, TypesOfActors types) {
		actors.set(positionObject(id), new Actor(id, identification, name, birthday, gender, cellNumber, email, types));
		
	}	
	
	public void deleteActor(String id) {
		for (Actor actor : actors) {
			if (actor.getId().equals(id)) {
				actors.remove(positionObject(id));
			}
		}
	}
	
	
	public int positionObject(String id) {
		for (int i = 0; i < actors.size(); i++) {
			if (actors.get(i).getId().equals(id)) {
				return i;
			}			
		}
		return -1;
	}
	
	public boolean exist(String id) {
		for (Actor actor : actors) {
			if (id.compareTo(actor.getId())==0) {
				return true;
			}
		}
		
		return false;
	}
	
	public Actor searchById(String id) {
		if (exist(id)) {
			return actors.get(positionObject(id));
		}
		return null;
	}
	
	
	

}
