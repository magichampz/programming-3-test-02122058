package InfoPanels;

import javax.swing.*;
import java.net.URL;
import java.net.MalformedURLException;

//import java.util.PrimitiveIterator;

public class PicturePanel {

    JLabel label = new JLabel();
    private URL imageURL;

    public PicturePanel(URL imageURL){
        this.imageURL = imageURL;

//        try {
//            this.imageURL = imageURL;
//        }
//        catch (MalformedURLException e){
//            System.out.println(e.getMessage());
//        }

        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);

    }


}
