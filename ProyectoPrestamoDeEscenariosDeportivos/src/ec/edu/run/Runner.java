package ec.edu.run;

import ec.edu.GUI.MainLoginWindow;
import ec.edu.GUI.MainWindow;
import ec.edu.GUI.admin.MainAdminWindow;
import ec.edu.control.Control;

public class Runner {

	public static void main(String[] args) {
//		PrincipalWindow n= new PrincipalWindow();
//		n.setVisible(true);
		
//		MainAdminWindow mng= new MainAdminWindow();
//		mng.setVisible(true);
		
		MainLoginWindow window= new MainLoginWindow();
//		MainWindow window= new MainWindow();
		Control control= new Control(window);
		window.setControll(control);
		System.out.println("f");

	}

}
