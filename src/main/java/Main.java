import InfoPanels.PatientPanel;
import PatientDetails.BP;
import PatientDetails.MRI;
import PatientDetails.Patient;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws MalformedURLException {

        List<Patient> Patients = new ArrayList<Patient>();

        URL imagePat1 = new URL ("https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        URL imagePat2 = new URL("https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");
        URL imageMri1 = new URL("https://martinh.netfirms.com/BIOE60010/mri1.jpg");
        URL imageMri2 = new URL ("https://martinh.netfirms.com/BIOE60010/mri2.jpg");
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
            System.out.println("PatientDetails.Patient: "+ log.get(0) + ": PatientDetails.MRI: " + log.get(1) + ", "+ log.get(2) + ": PatientDetails.BP: " + log.get(3)+ ", "+log.get(4));
        }

        JFrame frame = new JFrame("Medical Log");
        frame.setSize(1000,600);

        JPanel displayPanel = new JPanel();
        PatientPanel pat1Panel = new PatientPanel(pat1);
        PatientPanel pat2Panel = new PatientPanel(pat2);
        displayPanel.add(pat1Panel);
//        displayPanel.add(pat2Panel);


        frame.setContentPane(displayPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });





    }
}
