package ec.edu.model;

import java.util.Calendar;

import ec.edu.model.types.Gender;
import ec.edu.model.types.TypesOfActors;

public class Actor {
	
	private String id;
	private String identification;
	private String name;
	private Calendar birthday;
	private Gender gender;
	private String CellNumber;
	private String email;
	private TypesOfActors types;
	
	

	

	public Actor(String id, String identification, String name, Calendar birthday, Gender gender, String cellNumber,
			String email, TypesOfActors types) {
		super();
		this.id = id;
		this.identification = identification;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		CellNumber = cellNumber;
		this.email = email;
		this.types = types;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Calendar getBirthday() {
		return birthday;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}

	public TypesOfActors getTypes() {
		return types;
	}

	public void setTypes(TypesOfActors types) {
		this.types = types;
	}

	public String getGender() {
		return gender.name();
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getCellNumber() {
		return CellNumber;
	}

	public void setCellNumber(String cellNumber) {
		CellNumber = cellNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
