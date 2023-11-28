package InfoPanels;

import PatientDetails.Patient;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class PatientPanel extends JPanel {

    private Patient pat;

    // testing an image
    private URL imageURL = new URL("https://martinh.netfirms.com/b3ta/kennyg.jpg");
    public PatientPanel(Patient pat) throws MalformedURLException {
        this.pat = pat;
        JLabel details = new JLabel();
        details.setBorder(new EmptyBorder(10, 10, 10, 10));
        JLabel bpDetails = new JLabel();
        bpDetails.setBorder(new EmptyBorder(10, 10, 10, 10));


        details.setText("<html> Name: " + pat.getName() + "<br>Age: " + Integer.toString(pat.getAge())+"</html>");
        bpDetails.setText("<html> Blood Pressure<br>" + pat.getBp().getSys() + " over " + pat.getBp().getDia()+ "</html>");


        this.setLayout(new GridLayout(1,4));

        this.add(new PicturePanel(pat.getImageUrl()).label);
        this.add(details);
        this.add(new PicturePanel(pat.getMri().getImageUrl()).label);
        this.add(bpDetails);


    }

}
