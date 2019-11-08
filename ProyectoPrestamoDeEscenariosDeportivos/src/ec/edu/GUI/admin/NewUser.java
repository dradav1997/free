package ec.edu.GUI.admin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ec.edu.control.Control;
import ec.edu.view.ActionsView;

public class NewUser extends JFrame implements ActionListener {
	
	private Control control;
	private JLabel lblTitle;
	
	private JPanel pnlForm;
	
	private JLabel lblId;
	private JLabel lblIdentification;
	private JLabel lblName;
	private JLabel lblUserName;
	private JLabel lblPassWord;
	
	private JTextField txtId;
	private JTextField txtIdentification;
	private JTextField txtName;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	
	private JButton btnCancel;
	private JButton btnAdd;
	
	
	
	public NewUser(Control control) {
		this.control= control;
		setTitle("Nuevo Usuario");
		setSize(new Dimension(320, 350));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		begin();		
	}

	private void begin() {
		begingComponents();
		characteristics();
		addComponents();
		setVisible(true);
		
	}

	private void begingComponents() {

		lblId= new JLabel("Id");
		lblIdentification= new JLabel("Identificacion");
		lblName= new JLabel("Nombre");
		lblUserName= new JLabel("Nombre de Usuario");
		lblPassWord= new JLabel("Contraseña");
		
		txtId= new JTextField();
		txtIdentification= new JTextField();
		txtName= new JTextField();
		txtUserName= new JTextField();
		txtPassword= new JPasswordField();
		

		
		btnAdd= new JButton("Agregar");	
		btnCancel= new JButton("Cancelar");		
		
	}

	private void characteristics() {
//		btnAñadir.setActionCommand("agregar");
//		btnAñadir.addActionListener(this);
		
		btnAdd.setActionCommand(ActionsView.NEW_USER);
		btnAdd.addActionListener(control);
		
		btnCancel.setActionCommand("cancelar");
		btnCancel.addActionListener(this);
		// TODO Auto-generated method stub
		
	}

	private void addComponents() {
//		private JLabel lblId;
//		private JLabel lblIdentification;
//		private JLabel lblName;
//		private JLabel lblUserName;
//		private JLabel lblPassWord;
//		
//		private JTextField txtId;
//		private JTextField txtIdentification;
//		private JTextField txtName;
//		private JTextField txtUserName;
//		private JPasswordField txtPassword;
//		
//		private JButton btnCancel;
//		private JButton btnAdd;
		this.add(lblId);
		this.add(lblIdentification);
		this.add(lblName);
		this.add(lblUserName);
		this.add(lblPassWord);
		
		this.add(txtId);
		this.add(txtIdentification);
		this.add(txtName);
		this.add(txtUserName);
		this.add(txtPassword);
		
		this.add(btnAdd);
		this.add(btnCancel);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
