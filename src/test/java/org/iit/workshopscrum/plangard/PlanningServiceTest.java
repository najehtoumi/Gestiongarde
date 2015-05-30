package org.iit.workshopscrum.plangard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Doctor;
import model.ListDoctor;

import org.junit.Test;

public class PlanningServiceTest {

	@Test
	public void test_addDoctor_CaseManyDoctors() {
		String s = "02/07/08";
		String s1 = "07/06/10";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Date f = new Date();
		try {
			f = sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date k = new Date();
		try {
			k = sdf.parse(s1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

		ListDoctor doctors = new ListDoctor();
		List<Date> DoctorlistHoliday = new ArrayList<Date>();
		List<Date> DoctorlistHoliday1 = new ArrayList<Date>();
		List<Date> DoctorlistHoliday2 = new ArrayList<Date>();
		DoctorlistHoliday.add(f);
		DoctorlistHoliday.add(k);
		DoctorlistHoliday1.add(10 / 11 / 2014, null);
		DoctorlistHoliday2.add(13 / 11 / 2014, null);
		// List<holidays> table;
		Doctor d1 = new Doctor(DoctorlistHoliday, 1, "nadia", "kacem");
		Doctor d2 = new Doctor(DoctorlistHoliday1, 2, "najeh", "toumi");
		Doctor d3 = new Doctor(DoctorlistHoliday2, 3, "amir", "trabelsi");
		doctors.add(d1);
		System.out.println(doctors.lDoctor.get(0).getId());
		System.out.println(doctors.lDoctor.get(0).getNom());
		System.out.println(doctors.lDoctor.get(0).getPrenom());
		System.out.println(doctors.lDoctor.get(0).getHolidays().get(0));
		System.out.println(doctors.lDoctor.get(0).getHolidays().get(1));
		doctors.add(d2);
		doctors.add(d3);

	}

}