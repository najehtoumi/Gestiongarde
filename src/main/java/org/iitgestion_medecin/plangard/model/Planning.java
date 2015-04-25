package org.iitgestion_medecin.plangard.model;
import java.util.Date;
import java.util.Map;


	public class Planning {
		private Map<Date, Doctor> gardPlanning;

		/**
		 * @return the gardPlanning
		 */
		public Map<Date, Doctor> getGardPlanning() {
			return gardPlanning;
		}

		/**
		 * @param gardPlanning the gardPlanning to set
		 */
		public void setGardPlanning(Map<Date, Doctor> gardPlanning) {
			this.gardPlanning = gardPlanning;
		}

	}
