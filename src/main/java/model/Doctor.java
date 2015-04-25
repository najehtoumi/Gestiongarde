package model;

import java.util.Date;
import java.util.List;

public class Doctor {
	private String name;
	private List<Date> holidays;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Date> getHolidays() {
		return holidays;
	}
	public void setHolidays(List<Date> holidays) {
		this.holidays = holidays;
	}
	

}
