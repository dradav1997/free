package ec.edu.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

import ec.edu.GUI.styles.RoundedBorderButton;
import ec.edu.control.Control;
import ec.edu.view.ActionsView;



//this class is the login 

public class MainLoginWindow extends JFrame implements ActionsView{
	Control control;
	
	
	// ---------interface elements---------------
	private JPanel pnlLogin;
	private JPanel pnlLogo;
	
	private JLabel imgLogo;
	private JLabel lblUser;
	private JLabel lblPassword;
	
	private JTextField txtUser;
	private JPasswordField txtPassword;
	
	private JButton btnLogin;
	//-------------------------------------------
	
	
	public MainLoginWindow() {
		setTitle("SERVICLAS - DEPORTES");
		setSize(new Dimension(320, 350));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		begin();		
	}

	@SuppressWarnings("deprecation")
	@Override
	public String[] readInput(String option) {
		String[] dates=null;
		switch (option) {
		case "login":
			dates= new String[2];
			dates[0]=txtUser.getText();
			dates[1]= txtPassword.getText();
			
			break;

		default:
			break;
		}
		return dates;
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
		characteristics();
		addComponents();
		setVisible(true);
		
	}
	
	private void begingComponents() {
		pnlLogin= new JPanel();		
		pnlLogo= new JPanel();
		imgLogo= new JLabel();
		
		lblUser= new JLabel("Usuario");
		lblPassword= new JLabel("Contraseña");
		txtUser= new JTextField();
		txtPassword= new JPasswordField();
		
		
		
		btnLogin= new JButton("Acceder");
		btnLogin.addActionListener(control);
		btnLogin.setActionCommand(ActionsView.LOGIN);
		
		//btnLogin.setFocusable(false);
//		Color c = UIManager.getLookAndFeel().getDefaults().getColor( "Panel.background");
//		btnLogin.setBackground(new Color(c.getRed(),c.getGreen(),c.getBlue()));
		//btnLogin.setBorder(new RoundedBorderButton(40));
		
	}

	private void characteristics() {
		
		
		
		imgLogo.setIcon(new ImageIcon("Resources/images/balon2.png"));
		pnlLogo.setLayout(new BorderLayout());
		pnlLogo.add(imgLogo,BorderLayout.CENTER);
		
		pnlLogin.setLayout(new GridLayout(3, 2,-85,10));
		pnlLogin.add(lblUser);
		pnlLogin.add(txtUser);
		pnlLogin.add(lblPassword);
		pnlLogin.add(txtPassword);
		//pnlLogin.add(new JLabel(" "));
		pnlLogin.add(btnLogin);
		
		pnlLogo.setBounds(90, 10, 128, 128);
		pnlLogin.setBounds(10,160,300,100);
		//btnLogin.setBounds(170,260,120,30);
		
		this.add(pnlLogo);
		this.add(pnlLogin);
		//this.add(btnLogin);
	
		
		// TODO Auto-generated method stub
		
	}

	

	private void addComponents() {
		
		
	}

	@Override
	public void exit() {
		int exit=JOptionPane.showConfirmDialog(null, "Esta segur@ de salir","salir",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (exit== JOptionPane.YES_NO_OPTION){
			System.exit(0);
		}
		
	}

	
	
	

}
