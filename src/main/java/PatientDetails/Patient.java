package PatientDetails;

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

    public Patient(String name, int age, URL imageUrl, MRI mri, BP bp){
        this.name = name;
        this.age = age;
        this.imageUrl = imageUrl;
        this.mri = mri;
        this.bp = bp;
        this.patientLog = new ArrayList<String>();

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
