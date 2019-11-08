package ec.edu.view;

import java.util.ArrayList;

import ec.edu.control.Control;



public interface ActionsView {
	
	// aqui agregar las acciones a realizar
	//String COSTANTE(ingles)= "Texto de la constante(Español)";
	String LOGIN="login";
	
	// ########################################################### MANAGEMENT SYSTEM - ADMIN #################################################################
	// -----------------USERS OF SYSTEM--------------------------------------
	String ADD_USER="agregar usuario";// button for principal frame admin
	String DELETE_USER="eliminar usuario";// delete user of chart
	String MODIFY_USER="modificar usuario";
	String NEW_USER="nuevo usuario"; // for the new jframe to add a new user
	
	// ----------------- STAGES ----------------------------------------
	// these elements are in principal frame admin
	String ADD_STAGE="agregar escenario";
	String MODIFY_STAGE="modificar escenario";
	String DELTE_STAGE="eliminar escenario";
	String SEARCH_STAGE="buscar escenario"; 

	//this element in new fram to add new stage
	String NEW_STAGE="nuevo  escenario";
	String UPDATE_STAGE="actualizar escenario";
	
	// ----------------- ACTORS ----------------------------------------
	// these elements are in principal frame admin
	String ADD_ACTOR="agregar actor";
	String MODIFY_ACTOR="modificar actor";
	String DELTE_ACTOR="eliminar actor";
	String SEARCH_ACTOR="buscar actor"; 

	//this element in new fram to add new stage
	String NEW_ACTOR="nuevo  actor";
	String UPDATE_ACTOR="actualizar actor";
	
	// ########################################################### LOAN SYSTEM - USERS #################################################################
	// these elements are in principal frame loans
	String SEARCH_SCHEDULE_AVAILABLE="buscar horarios disponibles";
	
	String ADD_LOAN="agregar prestamo";
	String MODIFY_LOAN="modificar prestamo";
	String FINALIZE_LOAN="finalizar prestamo";
	String SEARCH_LOANS="buscar prestamos";
	
	String SEARCH_LOANS_HISTORY="buscar en historial de prestamos";
	
	
	
	
	// metodos basicos de lectura y escritura en la GUI
 	String [] readInput(String option);
    void writeOutput(String option, boolean status, String ...output);	    
    void setControll(Control control);
    void begin();
    void exit();
		

}
