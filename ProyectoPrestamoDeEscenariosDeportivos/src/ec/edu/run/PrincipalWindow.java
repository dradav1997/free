package ec.edu.run;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
;

public class PrincipalWindow extends JFrame {
	
	private JTabbedPane jtpTabs;
	
	
	
	public PrincipalWindow() {
		this.setSize(new Dimension(600, 680));
		this.setLocation(450, 50);
        this.setTitle("Hospital");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        initialize();
        characteristics();
        add();
	}


	private void initialize() {
		jtpTabs= new JTabbedPane();
		
		
	}


	private void characteristics() {
		jtpTabs.addTab("Recepcionistas", new JPanel());
		jtpTabs.addTab("Habitaciones",new JPanel());
	}

	private void add() {
		add(jtpTabs);		
	}

	

	
}
