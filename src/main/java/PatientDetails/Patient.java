package PatientDetails;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Patient {

    private String name;
    private int age;
    private URL imageUrl;
    private MRI mri;
    private BP bp;

    private List<String> patientLog;

    // to add additional patient data,


    public Patient(String name, int age, MRI mri, BP bp){
        this.name = name;
        this.age = age;
        this.imageUrl = null;
        this.mri = mri;
        this.bp = bp;
        this.patientLog = new ArrayList<String>();

        // a log of all the patient details as strings to display onto the panel outputs
        patientLog.add(name);
        patientLog.add(Integer.toString(mri.getFieldStrength()));
        patientLog.add(mri.getScanDate().toString());
        patientLog.add(bp.getTerm());
        patientLog.add(bp.getExamDate().toString());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public URL getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String Url) {
        try {
            this.imageUrl = new URL(Url);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

    }

    public MRI getMri() {
        return mri;
    }

    public BP getBp() {
        return bp;
    }

    public List<String> getPatientLog() {
        return patientLog;
    }
}
