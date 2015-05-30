package service;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.List;
import model.Planning;
import model.Doctor;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;

import model.Doctor;
public class PlanningService {
	public Planning genereratePlanning (List<Doctor> doctors, String starDate, String endDate){
		Planning planning = new Planning();
		int j=0;
		Date h =new Date();
		boolean b=true;
		try {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		    Date dateMin = dateFormat.parse(starDate);
		    Date dateMax = dateFormat.parse(endDate);
		 
		    Calendar calendar = Calendar.getInstance();
		    calendar.setTime(dateMin);
		    Calendar calMax = Calendar.getInstance();
		    calMax.setTime(dateMax);
		    for (; calendar.before(calMax); calendar.add(Calendar.DATE, 1))
		      {
//		    	if (j>=doctors.length())
//		    	{
//		    		j=0;
//		    	}
		    	//for(int k =0)
		    	 
		        //TODO Traitement
		      }
			}
		catch (ParseException e) 
		{
		}
		return  planning;
	}
//uses story1 
}
