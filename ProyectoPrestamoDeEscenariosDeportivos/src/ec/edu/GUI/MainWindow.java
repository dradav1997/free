package ec.edu.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ec.edu.control.Control;
import ec.edu.view.ActionsView;

public class MainWindow extends JFrame implements ActionsView,ActionListener{
	Control control;
	private JButton btnLogin;
	public MainWindow() {
		setTitle("Gestion de cargos");
		setSize(new Dimension(640, 480));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		begin();
	}

	@Override
	public String[] readInput(String option) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeOutput(String option, boolean status, String... output) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControll(Control control) {
		this.control= control;
		this.addWindowListener(control);
		
		
	}

	@Override
	public void begin() {
		begingComponents();
		addComponents();
		setVisible(true);
		
	}

	private void begingComponents() {
		// TODO Auto-generated method stub
		btnLogin= new JButton("Acceder");
		
		btnLogin.setActionCommand(ActionsView.ADD_USER);
		btnLogin.addActionListener(this.control);
		
		btnLogin.setBounds(170,260,120,30);
	}

	private void addComponents() {
		// TODO Auto-generated method stub
		this.add(btnLogin);
		
	}

	@Override
	public void exit() {
		int exit=JOptionPane.showConfirmDialog(null, "Esta segur@ de salir","salir",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (exit== JOptionPane.YES_NO_OPTION){
			System.exit(0);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("algo");
	}
	
	

}
