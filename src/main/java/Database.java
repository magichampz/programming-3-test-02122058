import PatientDetails.Patient;

import java.util.ArrayList;
import java.util.List;

// wanted to implement database to store patient details but did not have time

public class Database {

    private List<Patient> patientList;

    public Database(){
        this.patientList = new ArrayList<Patient>();
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void addPatient(Patient patient){

    }
}
