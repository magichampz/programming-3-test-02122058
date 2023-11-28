import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Patient> Patients = new ArrayList<Patient>();

        URL imagePat1 = null;
        URL imagePat2 = null;
        URL imageMri1 = null;
        URL imageMri2 = null;
        MRI mriPat1 = new MRI(imageMri1,2, LocalDate.of(2023,9,14));
        MRI mriPat2 = new MRI(imageMri2,4, LocalDate.of(2023,11,19));
        BP bpPat1 = new BP(130,70,LocalDate.of(2023,9,15),"ST");
        BP bpPat2 = new BP(150,80,LocalDate.of(2023,11,20),"VST");


        Patient pat1 = new Patient("Daphne Von Oram",62, imagePat1, mriPat1, bpPat1);
        Patient pat2 = new Patient("Sebastian Compton",31, imagePat2, mriPat2, bpPat2);

        Patients.add(pat1);
        Patients.add(pat2);

        List<String> patientLog = new ArrayList<String>();


        for (Patient pat:Patients){
            List<String> log = pat.getPatientLog();
            System.out.println("Patient: "+ log.get(0) + ": MRI: " + log.get(1) + ", "+ log.get(2) + ": BP: " + log.get(3)+ ", "+log.get(4));
        }





    }
}
