package model;

import java.util.List;

public interface IPatient {
    public List<Patient> listPatientByName(String lastName, List<Patient> patient);

    public List<Patient> listPatientByDateOfBirth(String dateOfBirth, List<Patient> patient);

    public List<Patient> listPatientByCity(String city, List<Patient> patient);

}
