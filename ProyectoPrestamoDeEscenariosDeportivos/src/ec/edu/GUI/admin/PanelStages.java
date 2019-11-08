package ec.edu.GUI.admin;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ec.edu.control.Control;

public class PanelStages extends JPanel{
	private Control control;
	private JLabel lblHour;
	private JLabel lblSeeHour;
	private JLabel lblUser;
	private JLabel lblNameUser;
	private JLabel lblTitle;
	
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane jScrollPane;
	
	private JButton btnAddStage;
	
	public PanelStages() {
		setLayout(new FlowLayout());
		setVisible(true);
		initialize();
        characteristics();
        add();
	}

	private void initialize() {
		lblHour= new JLabel("Hora: ");
		lblSeeHour= new JLabel("--------");
		lblUser= new JLabel("Usuario: ");
		lblNameUser= new JLabel("-------");
		lblTitle= new JLabel("Control de Escenarios");
		
		String[] titles= new String[] {"Nombre","Descripcion","Notas","-------","--------"};
		model= new DefaultTableModel(titles, 0);
		table= new JTable(model);
		jScrollPane = new JScrollPane(table);		
		
		btnAddStage= new JButton("Nuevo");
		
	}

	private void characteristics() {
		// TODO Auto-generated method stub
		
	}

	private void add() {
		this.add(lblHour);
		this.add(lblSeeHour);
		this.add(lblUser);
		this.add(lblNameUser);
		this.add(lblTitle);
		this.add(jScrollPane);
		this.add(btnAddStage);
		
	}

	

	


}
