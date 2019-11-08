package ec.edu.model.DAO;

import java.util.ArrayList;

import ec.edu.model.User;
import ec.edu.utilities.FileDao;

public class DaoUser {
	private String route="Resources/Files/Usuarios.txt";
	private FileDao dao;
	
	public DaoUser() {
		dao= new FileDao();		
	}
	
	public void addUser(User user) {		
		dao.createFileAddText(route, user.toString());		
	}
	
	public ArrayList<User> users(){
		ArrayList<User> ussers= new ArrayList<>();
		ArrayList<String> contentFile= dao.ContentFile(route);
		for (String string : contentFile) {
			String[] date= string.split(";");
			ussers.add(new User(date[0],date[1],date[2],date[3],date[4],date[5]));
		}
		
		return ussers;
	}
	
	public void modifyUsers(ArrayList<User> users) {
		dao.overwriteInformation(route, "");
		for (User user : users) {
			dao.createFileAddText(route, user.toString());
		}
	}
	
	
	
	
	
	

}
