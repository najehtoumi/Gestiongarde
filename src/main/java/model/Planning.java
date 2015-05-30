package model;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
public class Planning {
	private  Map<Date, Doctor> gardPlanning=new HashMap<Date, Doctor>();

	public Map<Date, Doctor> getGardPlanning() {
		return gardPlanning;
	}

	public void setGardPlanning(Map<Date, Doctor> gardPlanning) {
		this.gardPlanning = gardPlanning;
	} 

}
