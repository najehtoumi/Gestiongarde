package service;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.List;

import model.planning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;

import model.Doctor;
public class PlanningService {
	public planning genereratePlanning (List<Doctor> doctors, String starDate, String endDate){
		planning planning = new planning();
		int j=0;
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
		    	 System.out.println(dateFormat.format(calendar.getTime()));
		    	 
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
