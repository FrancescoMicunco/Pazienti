package model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientsList implements IPatient {
    public List<Patient> patientslist(String filepath) throws Exception {
        Scanner data = new Scanner(new File(filepath));
        List<Patient> patients = new ArrayList<Patient>();
        int listsize = Integer.parseInt(data.nextLine());

        return patients;
    }

    @Override
    public List<Patient> listPatientByName(String lastName, List<Patient> patient) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Patient> listPatientByDateOfBirth(String dateOfBirth, List<Patient> patient) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Patient> listPatientByCity(String city, List<Patient> patient) {
        // TODO Auto-generated method stub
        return null;
    }
}
