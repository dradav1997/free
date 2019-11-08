package ec.edu.model;

public class User {
	
	private String id;
	private String name;
	private String lastName;
	private String identification;
	private String userName;
	private String password;
	
	
	public User(String id, String name, String lastName, String identification, String userName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.identification = identification;
		this.userName = userName;
		this.password = password;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIdentification() {
		return identification;
	}


	public void setIdentification(String identification) {
		this.identification = identification;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return id+";"+identification+";"+name+";"+lastName+";"+userName+";"+password;
	}
	
	
	
	
	

}
