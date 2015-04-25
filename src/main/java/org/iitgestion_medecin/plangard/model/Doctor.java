package org.iitgestion_medecin.plangard.model;
import java.util.Date;
import java.util.*;

public class Doctor {
	private String nom_doc;
	private List<Date> Holidays;
	public String getNom_doc() {
		return nom_doc;
	}
	public void setNom_doc(String nom_doc) {
		this.nom_doc = nom_doc;
	}
	public List<Date> getHolidays() {
		return Holidays;
	}
	public void setHolidays(List<Date> holidays) {
		Holidays = holidays;
	}
	

}
