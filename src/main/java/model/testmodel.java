package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class testmodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Doctor> listDoctor = new ArrayList<Doctor>();
		List<Date> DoctorlistHoliday = new ArrayList<Date>();
		List<Date> DoctorlistHoliday1 = new ArrayList<Date>();
		List<Date> DoctorlistHoliday2 = new ArrayList<Date>();
		DoctorlistHoliday.add(12 / 11 / 2014, null);
		DoctorlistHoliday1.add(10 / 11 / 2014, null);
		DoctorlistHoliday2.add(13 / 11 / 2014, null);
		// List<holidays> table;
		listDoctor.add(new Doctor(DoctorlistHoliday, 1, "kacem", "nadia"));
		listDoctor.add(new Doctor(DoctorlistHoliday1, 2, "najeh", "toumi"));
		listDoctor.add(new Doctor(DoctorlistHoliday2, 3, "najeh", "toumi"));

	}

}
