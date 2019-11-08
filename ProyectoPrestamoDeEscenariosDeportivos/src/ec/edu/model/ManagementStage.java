package ec.edu.model;

import java.util.ArrayList;
import java.util.Calendar;

import ec.edu.model.types.Gender;
import ec.edu.model.types.TypesOfActors;

public class ManagementStage {
	private String routeActorsFile="Resources/Files/Escenarios.txt";
	private ArrayList<Stage> stages;

	public ManagementStage() {
		
	}
	
	public boolean addStage(String id, String name, String description, String observation) {
		if (!exist(id)) {
			stages.add(new Stage(id, name, description, observation));
			return true;
		}else {
			return false;
		}	
	}
	
	public void modifyStage(String id, String name, String description, String observation) {
		stages.set(positionObject(id),new Stage(id, name, description, observation) );
		
	}	
	
	public void deleteStage(String id) {
		for (Stage stage : stages) {
			if (stage.getId().equals(id)) {
				stages.remove(positionObject(id));
			}
		}
	}
	
	
	
	public int positionObject(String id) {
		for (int i = 0; i < stages.size(); i++) {
			if (stages.get(i).getId().equals(id)) {
				return i;
			}			
		}
		return -1;
	}
	
	public boolean exist(String id) {
		for (Stage stage : stages) {
			if (id.compareTo(stage.getId())==0) {
				return true;
			}
		}
		
		return false;
	}
	
	public Stage searchById(String id) {
		if (exist(id)) {
			return stages.get(positionObject(id));
		}
		return null;
	}
	


	
}
