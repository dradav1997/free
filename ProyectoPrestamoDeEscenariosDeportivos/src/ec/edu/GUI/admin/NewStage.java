package ec.edu.GUI.admin;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ec.edu.control.Control;

public class NewStage extends JFrame {
	private Control control;
	private JPanel pnlMain;
	
	private JLabel lblTitle;
	private JLabel lblName;
	private JLabel lblDescription;
	private JLabel lblObservation;
	
	private JTextField txtName;
	private JTextArea txtDescription;
	private JTextArea txtObservation;
	
	private JButton btnCancelar;
	private JButton btnAdd;
	
	
	
	public NewStage(Control control) {
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

		pnlMain= new JPanel();
		lblTitle= new JLabel("Nuevo Escenario Deportivo");
		lblName= new JLabel("Nombre");
		lblDescription= new JLabel("Descripción");
		lblObservation= new JLabel("Observaciones");
		
		txtName= new JTextField();
		txtDescription= new JTextArea();
		txtDescription= new JTextArea();
		
		btnAdd= new JButton("Agregar");
		btnCancelar= new JButton("Cancelar");
		
	}

	private void characteristics() {
		// TODO Auto-generated method stub
		
	}

	private void addComponents() {
//		private JPanel pnlMain;
//		
//		private JLabel lblTitle;
//		private JLabel lblName;
//		private JLabel lblDescription;
//		private JLabel lblObservation;
//		
//		private JTextField txtName;
//		private JTextArea txtDescription;
//		private JTextArea txtObservation;
//		
//		private JButton btnCance
		
		this.add(lblTitle);
		this.add(lblName);
		this.add(lblDescription);
		this.add(lblObservation);
		
		this.add(txtName);
		this.add(txtDescription);
		this.add(txtObservation);
		
		this.add(btnAdd);
		this.add(btnCancelar);
		
	}

}
