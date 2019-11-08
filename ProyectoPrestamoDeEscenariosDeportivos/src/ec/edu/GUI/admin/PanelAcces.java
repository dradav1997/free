package ec.edu.GUI.admin;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import ec.edu.control.Control;
import ec.edu.view.ActionsView;

public class PanelAcces extends JPanel{
	private Control control;
	private JLabel lblHour;
	private JLabel lblSeeHour;
	private JLabel lblUser;
	private JLabel lblNameUser;
	private JLabel lblTitle;
	
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane jScrollPane;
	
	private JButton btnAddUser;
	private JButton btnModifyUsser;
	private JButton btnDeleteUsser;
	
	
	//aqui irian los componentes
	/* 
	 * lbl para jlabel
	 * btn para jbutton
	 * txt para jtexfield y jtexarea 
	 * pnl para jpanel
	 * mnu para jmenu
	 * 
	 * */

	
	//---------modelo de tabla-------------------------
//	private DefaultTableModel model;
//	private JTable table;
//	private JScrollPane jScrollPane;
	
	
//	String[] titles= new String[] {"Nombre","Id","Stock","StockMin"};
//	model= new DefaultTableModel(titles, 0);
//	table= new JTable(model);
//	jScrollPane = new JScrollPane(table);
	//-------------------------------------------------
	
	

	
	
	
	public PanelAcces(Control control) {
		this.control= control;
		FormatJFrame();
		BeginComponents();
		FormatComponents();		
		AddComponentes();
	}

	private void FormatJFrame() {
		setLayout(null);
		setVisible(true);
	}

	private void BeginComponents() {
		
		lblHour= new JLabel("Hora: ");
		lblSeeHour= new JLabel("--------");
		lblUser= new JLabel("Usuario: ");
		lblNameUser= new JLabel("-------");
		lblTitle= new JLabel("Control de Acceso de Usuarios");
		
		String[] titles= new String[] {"Id","Usuario","Nombre"};
		model= new DefaultTableModel(titles, 0);
		table= new JTable(model);
		jScrollPane = new JScrollPane(table);		
		
		btnAddUser= new JButton("Nuevo");
		btnModifyUsser= new JButton("Modificar");
		btnDeleteUsser= new JButton("Eliminar");
	}

	private void FormatComponents() {
//		btnAñadir.setActionCommand("agregar");
//		btnAñadir.addActionListener(this);
//		Color c = UIManager.getLookAndFeel().getDefaults().getColor( "Panel.background");
//		btnAddUser.setBackground(new Color(c.getRed(),c.getGreen(),c.getBlue()));
		
		btnAddUser.setActionCommand(ActionsView.ADD_USER);
		btnAddUser.addActionListener(control);		
		
		btnModifyUsser.setActionCommand(ActionsView.MODIFY_USER);
		btnAddUser.addActionListener(control);
		
		btnDeleteUsser.setActionCommand(ActionsView.DELETE_USER);
		btnDeleteUsser.addActionListener(control);
		
		//elements locations
		
		lblHour.setBounds(10,10,50,10);
		lblSeeHour.setBounds(60,10,50,10);
		
		lblUser.setBounds(300,10,50,10);
		lblNameUser.setBounds(360,10,50,10);
		
		lblTitle.setBounds(150,60,200,10);
		
		jScrollPane.setBounds(50,90,400,180);
		
		btnAddUser.setBounds(50,280,70,25);
		btnModifyUsser.setBounds(240,280,100,25);
		btnDeleteUsser.setBounds(350,280,100,25);
		
	}

	private void AddComponentes() {		
		this.add(lblHour);
		this.add(lblSeeHour);
		this.add(lblUser);
		this.add(lblNameUser);
		this.add(lblTitle);
		this.add(jScrollPane);
		this.add(btnAddUser);	
		this.add(btnModifyUsser);
		this.add(btnDeleteUsser);
	}
	
	//-------------Esto para llenarla no importante hasta el final
	
//	ArrayList<RawMaterial> formula= new ProyectEvents().devolverMaterias();
//	for (int i = 0; i < model.getRowCount(); i++) {
//		model.removeRow(i);
//		i--;
//	}
//	
//	for (int i = 0; i < formula.size(); i++) {
//		Object[] row= new Object[] {formula.get(i).getName(),formula.get(i).getId(),formula.get(i).getLot(),formula.get(i).getStockmin()};
//		model.addRow(row);
//	}

}
