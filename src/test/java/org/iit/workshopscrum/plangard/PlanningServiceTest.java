package org.iit.workshopscrum.plangard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import model.Doctor;
import model.planning;
import service.PlanningService;

public class PlanningServiceTest {
private PlanningService planningservice = new PlanningService();

@Test (expted = ImpossibleTocreatePlanning.class)
public void test_DoctorListEmptyAndStartDateEqualEndDate(){
	List<Doctor> doctors = new ArrayList<Doctor>();
	Date starDate = new Date();
	Date endDate = new Date();
	planning planning = planningservice.genereratePlanning(doctors, starDate, endDate);
	}
}