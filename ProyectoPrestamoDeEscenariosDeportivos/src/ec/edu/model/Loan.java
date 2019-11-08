package ec.edu.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Loan {
	private String id;
	private ArrayList<Actor> actors;
	private Stage stage;
	private Calendar date;
	
	public Loan() {
		actors= new ArrayList<>();
	}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public void addActor(Actor actor) {
		actors.add(actor);
	}

	public ArrayList<Actor> getActors() {
		return actors;
	}

	public void setActors(ArrayList<Actor> actors) {
		this.actors = actors;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
	
	
	
	
	
}
