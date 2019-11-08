package ec.edu.model.DAO;

import java.util.ArrayList;

import ec.edu.model.Actor;
import ec.edu.model.User;
import ec.edu.model.types.Gender;
import ec.edu.model.types.TypesOfActors;
import ec.edu.utilities.FileDao;

public class DaoActor {
	private String route="Resources/Files/Actores.txt";
	private FileDao dao;
	
	public DaoActor() {
		dao= new FileDao();		
	}
	
	public Gender searchGender(String date) {
		for (Gender n : Gender.values()) {
			if (date.equals(n.toString())) {
				return n;
			}
		}
		return null;
	}
	
	public TypesOfActors searchType(String date) {
		for (TypesOfActors n: TypesOfActors.values()) {
			if (date.equals(n.toString())) {
				return n;
			}
		}
		return null;
	}
	
	public void addUser(Actor actor) {		
		dao.createFileAddText(route, actor.toString());		
	}
	
	public ArrayList<Actor> actors(){
		ArrayList<Actor> actors= new ArrayList<>();
		ArrayList<String> contentFile= dao.ContentFile(route);
		for (String string : contentFile) {
			String[] date= string.split(";");
			//actors.add(new Actor(date[0], date[1], date[2], birthday, searchGender(date[4]), date[5], date[6], searchType(date[7])));
		}
		
		return actors;
	}
	
	public void modifyUsers(ArrayList<Actor> Actors) {
		dao.overwriteInformation(route, "");
		for (Actor Actor : Actors) {
			dao.createFileAddText(route, Actor.toString());
		}
	}

}
