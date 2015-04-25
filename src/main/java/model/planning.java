package model;
import java.util.Map;
import java.util.Date;
public class planning {
	private Map<Date, Doctor> gardPlanning;

	public Map<Date, Doctor> getGardPlanning() {
		return gardPlanning;
	}

	public void setGardPlanning(Map<Date, Doctor> gardPlanning) {
		this.gardPlanning = gardPlanning;
	} 

}
