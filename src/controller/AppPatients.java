package controller;

import model.PatientsList;

public class AppPatients {
	public static void main(String[] args) {
		PatientsList patients = new PatientsList();

		try {
			patients.patientslist(
					"F:\\FRANCESCO\\JavaProjects\\Pazienti\\src\\controller\\patientsList.txt");
		} catch (Exception e) {
			System.out.printf("file not found", e); // TODO
		}

	}
}
