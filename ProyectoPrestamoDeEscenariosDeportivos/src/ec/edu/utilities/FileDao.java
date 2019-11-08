package ec.edu.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileDao {

	public boolean overwriteInformation(String route, String text) {
		
		File archivo = new File(route);
		boolean existe = false;
		BufferedWriter bw;

		try {
			if (archivo.exists()) {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(text + ";\n");
				existe = true;
			} else {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(text);
				existe = false;

			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return existe;

	}

	public void createFileAddText(String route, String text) {
		
		
		//String ruta = "Resources/" + nombre + ".txt";
		File archivo = new File(route);

		try {

			FileWriter fstream = new FileWriter(archivo, true);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(text + ";\n");
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String ContentFileString(String route) {
		
		File archivo = new File(route);
		String cadena = null;
		String cadenaFinal = "++";

		try {
			
			FileReader f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);

			while ((cadena = b.readLine()) != null) {
				cadenaFinal= cadena+"++"+cadenaFinal;
			}

			b.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return cadenaFinal;

	}
	
	
public ArrayList<String> ContentFile(String route) {
		
		File archivo = new File(route);
		String cadena = null;
		
		ArrayList<String> finalarray= new ArrayList<String>();

		try {
			
			FileReader f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);

			while ((cadena = b.readLine()) != null) {
				finalarray.add(cadena);
			}

			b.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return finalarray;

	}

}
