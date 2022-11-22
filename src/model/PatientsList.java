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

        for (int i = 0; i < listsize; i++) {
            patients.add(new Patient(data.nextLine(), data.nextLine()));

            // Integer.parseInt(data.nextLine());
            // data.nextLine();
            // data.nextLine();
            // Double.parseDouble(data.nextLine());
            // Integer.parseInt(data.nextLine());
        }

        System.out.println(patients);

        return patients;
    }

    @Override
    public List<Patient> listPatientByName(String lastName, List<Patient> patient) {
        List<Patient> res = new ArrayList<Patient>();
        for (Patient p : patient) {
            if (p.getLastName().equalsIgnoreCase(lastName)) {
                res.add(p);
            }

        }

        return res;
    }

    @Override
    public List<Patient> listPatientByCity(String city, List<Patient> patient) {
        List<Patient> res = new ArrayList<Patient>();
        for (Patient p : patient) {
            if (p.getCity().equalsIgnoreCase(city)) {
                res.add(p);
            }
        }
        return res;
    }
}
