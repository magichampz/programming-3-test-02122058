import InfoPanels.PatientPanel;
import PatientDetails.BP;
import PatientDetails.MRI;
import PatientDetails.Patient;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
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

        String imageUrlPat1 = "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg";
        String imageUrlPat2 = "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg";
        String imageMri1 = "https://martinh.netfirms.com/BIOE60010/mri1.jpg";
        String imageMri2 = "https://martinh.netfirms.com/BIOE60010/mri2.jpg";
        MRI mriPat1 = new MRI(2, LocalDate.of(2023,9,14));
        mriPat1.setImageUrl(imageMri1);
        MRI mriPat2 = new MRI(4, LocalDate.of(2023,11,19));
        mriPat2.setImageUrl(imageMri2);
        BP bpPat1 = new BP(130,70,LocalDate.of(2023,9,15),"ST");
        BP bpPat2 = new BP(150,80,LocalDate.of(2023,11,20),"VST");


        Patient pat1 = new Patient("Daphne Von Oram",62, mriPat1, bpPat1);
        pat1.setImageUrl(imageUrlPat1);
        Patient pat2 = new Patient("Sebastian Compton",31, mriPat2, bpPat2);
        pat2.setImageUrl(imageUrlPat2);

        // test adding another patient
//        Patient pat3 = new Patient("Sebastian Compton",31, mriPat2, bpPat2);
//        pat3.setImageUrl(imageUrlPat2); // set to some other patient url



        // Additional Patients can be added here, the frame window size will adjust to show all
        Patients.add(pat1);
        Patients.add(pat2);
//        Patients.add(pat3);


        JFrame frame = new JFrame("Medical Log");
        JPanel displayPanel = new JPanel();


        for (Patient pat:Patients){
            try{
                PatientPanel patPanel = new PatientPanel(pat);
                patPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
                displayPanel.add(patPanel);

            }
            catch(Exception e){
                System.out.print("error with making the patient panel");
                JLabel patPanel = new JLabel("error");
                displayPanel.add(patPanel);


            }



//            patPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
//
//            displayPanel.add(patPanel);

            List<String> log = pat.getPatientLog();
            System.out.println("\nPatient: "+ log.get(0) + ": MRI: " + log.get(1) + ", "+ log.get(2) + ": BP: " + log.get(3)+ ", "+log.get(4));
        }

        // arbitrary height of 250 pixels for each patient entry added
        int height = Patients.size()*250;

        frame.setSize(1000,height);
        frame.setContentPane(displayPanel);
//        frame.pack();
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });






    }
}
