package ec.edu.GUI.admin;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ec.edu.control.Control;

public class PanelActors extends JPanel{
	private Control control;
	private JLabel lblHour;
	private JLabel lblSeeHour;
	private JLabel lblUser;
	private JLabel lblNameUser;
	private JLabel lblTitle;
	
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane jScrollPane;
	
	private JButton btnAddActor;
	
	
	public PanelActors(Control control) {
		this.control= control;
		FormatJFrame();
		BeginComponents();
		FormatComponents();		
		AddComponentes();
	}

	private void FormatJFrame() {
		// TODO Auto-generated method stub
		
	}

	private void BeginComponents() {
		lblHour= new JLabel("Hora: ");
		lblSeeHour= new JLabel("--------");
		lblUser= new JLabel("Usuario: ");
		lblNameUser= new JLabel("-------");
		lblTitle= new JLabel("Control de Acceso de Usuarios");
		
		String[] titles= new String[] {"Id","Usuario","Nombre","-------","--------"};
		model= new DefaultTableModel(titles, 0);
		table= new JTable(model);
		jScrollPane = new JScrollPane(table);		
		
		btnAddActor= new JButton("Nuevo");
		
	}

	private void FormatComponents() {
		// TODO Auto-generated method stub
		
	}

	private void AddComponentes() {
		this.add(lblHour);
		this.add(lblSeeHour);
		this.add(lblUser);
		this.add(lblNameUser);
		this.add(lblTitle);
		this.add(jScrollPane);
		this.add(btnAddActor);
		
	}

}
