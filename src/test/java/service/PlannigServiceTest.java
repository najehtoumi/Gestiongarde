package service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.iitgestion_medecin.plangard.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlannigServiceTest {
	private PlannigService planningService =new PlannigService();

	@Test
public void test_DoctorListEmptyAndStartDateEqualEnd() {
		//preparer input
		List<Doctor> doctors =new ArrayList<Doctor>();
		Date endDate =new Date();
		Date StartDate =new Date();
		
		
		
		// Call method under test
		Planning planning =planningService.generatePlannig(doctors,StartDate,endDate);
	    assertEquals(0,planning.getGardPlanning().size());
	}
	public void test_DoctorListwithAndStartDateEqualEnd() {
		//preparer input
		List<Doctor> doctors =new ArrayList<Doctor>();
		Date endDate =new Date();
		Date StartDate =new Date();
		
		
		
		// Call method under test
		Planning planning =planningService.generatePlannig(doctors,StartDate,endDate);
	    assertEquals(0,planning.getGardPlanning().size());
	}

}
