package InfoPanels;

import javax.swing.*;
import java.net.URL;
import java.net.MalformedURLException;

//import java.util.PrimitiveIterator;

public class PicturePanel {

    JLabel label = new JLabel();

    // panel to display pictures according to the url. the url exception is caught in other classes
    public PicturePanel(URL imageURL){

        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);

    }


}
