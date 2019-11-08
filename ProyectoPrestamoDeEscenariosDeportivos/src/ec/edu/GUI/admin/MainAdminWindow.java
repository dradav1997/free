package ec.edu.GUI.admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import ec.edu.control.Control;

public class MainAdminWindow extends JFrame{
	private Control control;
	
	private PanelAcces pnlAcces;
	private PanelStages pnlStages;
	private PanelActors pnlActors;
	
	private JTabbedPane jtpTabs;
	
	
	
	public MainAdminWindow() {
		this.setSize(new Dimension(600, 380));
		this.setLocation(450, 50);
        this.setTitle("Hospital");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        
        
        
        initialize();
        characteristics();
        add();
	}


	private void initialize() {
		jtpTabs= new JTabbedPane(JTabbedPane.LEFT,JTabbedPane.WRAP_TAB_LAYOUT);
		pnlAcces= new PanelAcces(control);
		pnlStages= new PanelStages();
		pnlActors= new PanelActors(control);
		
		
	}


	private void characteristics() {
		jtpTabs.addTab("Acceso", pnlAcces);
		jtpTabs.addTab("Escenarios",pnlStages);
		jtpTabs.addTab("Actores",pnlActors);
	}

	private void add() {
		add(jtpTabs);		
	}

	
	

}
