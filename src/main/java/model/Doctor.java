package model;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Doctor {
	// Declaration des champs des docteur 
		private 	int id ;
		private String nom;
		private String prenom;
		private List<Date> holidays;
		List<Doctor> list = new ArrayList<Doctor>();
		/*private List<Date> holidays;*/
		//initalisation des champs des docteurs 
	public Doctor(List<Date> holidays, int id, String prenom, String nom) {
			super();
			this.holidays = holidays;
			this.id = id;
			this.prenom = prenom;
			this.nom = nom;
		}
	// getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Date> getHolidays() {
		return holidays;
	}
	
	public void setHolidays(List<Date> holidays) {
		this.holidays = holidays;
	}

		  public void add(List<Doctor> listDoctor){
		    for(Doctor D : listDoctor)
		      list.add(D); 

		    System.out.println("Contenu de notre liste des docteurs :");
		    for(Doctor D : list)
		      System.out.print(D.toString());		
		   }
	
	}
