package service;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.List;
import model.Planning;
import model.Doctor;
import java.util.HashMap;
import model.ListDoctor;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;

import model.Doctor;
public class PlanningService {
	public Planning genereratePlanning (ListDoctor doctors, String starDate, String endDate){
		Planning p = new Planning();
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
		    	if (j>=doctors.lDoctor.size())
		    	{
		    		j=0;
		    	}
		    	for(int k =0;k < doctors.lDoctor.get(j).getHolidays().size();k++)
		    	{
		    		b=true;
		    		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		    		h = sdf.parse(dateFormat.format(calendar.getTime()));
		    		if(doctors.lDoctor.get(j).getHolidays().get(k).compareTo(h)==0 )
		    		{
		    			b=false;
		    			j++;
		    			
		    		}
		    		
		    	}
		    	if(b==true)
		    	{
		    		p.getGardPlanning().put(h, doctors.lDoctor.get(j));
		    		j++;
		    	}
	
		    	 
		        //TODO Traitement
		      }
			}
		catch (ParseException e) 
		{
		}
		return  p;
	}
//uses story1 
}
