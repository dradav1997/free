package ec.edu.control;

import java.security.MessageDigest;
import java.text.ParseException;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import ec.edu.model.Actor;
import ec.edu.model.Loan;
import ec.edu.model.ManagementLoan;
import ec.edu.model.Stage;
import ec.edu.model.User;
import ec.edu.model.DAO.DaoUser;
import ec.edu.model.types.Gender;
import ec.edu.model.types.TypesOfActors;

public class Run {

	public static void main(String[] args) throws ParseException {
		String textoSinEncriptar="admin"; 
		String textoEncriptadoConMD5=DigestUtils.md5Hex(textoSinEncriptar); 
		System.out.println("Texto Encriptado con MD5 : "+textoEncriptadoConMD5);
		
		System.out.println("igual? "+DigestUtils.md5Hex(textoSinEncriptar));
		DaoUser dao= new DaoUser();
		
		User us= new User("1", "david","vargas", "123", "admin", textoEncriptadoConMD5);
	    dao.addUser(us);
		
		
		MaskFormatter formatter = new MaskFormatter("(###) ###-####");
        JFormattedTextField textField = new JFormattedTextField(formatter);
        JOptionPane.showMessageDialog(null, textField);
		
		
		
		ManagementLoan mng= new ManagementLoan();
		Actor ac= new Actor("1", "12", "david", Calendar.getInstance(), Gender.MASCULINO, "311516652", "@",TypesOfActors.ESTUDIANTES );
		Stage stage= new Stage("1","cancha1", "hola", "aceptable");
		
		Loan tes= new Loan();
		tes.addActor(ac);
		tes.setId("1");
		tes.setStage(stage);
		
		Calendar date= Calendar.getInstance();		
		date.set(2019, 10, 8, 17, 0);
		tes.setDate(date);
		
		mng.addLoan(tes);
		System.out.println(Calendar.getInstance());
		System.out.println("putta mierdda inutil");
		ArrayList<Integer> n= mng.availableTimeStage(Calendar.getInstance(), stage);
		for (Integer integer : n) {
			System.out.println(integer);
		}

	}

}
