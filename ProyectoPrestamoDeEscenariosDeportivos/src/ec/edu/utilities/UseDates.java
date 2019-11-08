package ec.edu.utilities;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UseDates {
	
	public Date StringADate(String f){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date dateFinal= new Date();
		
		try {
			dateFinal=sdf.parse(f);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			dateFinal= new Date();
		}
		
		return dateFinal;
	}

}
