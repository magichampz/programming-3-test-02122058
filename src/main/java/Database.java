import PatientDetails.Patient;

import java.util.ArrayList;
import java.util.List;

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
