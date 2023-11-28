package PatientDetails;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

public class MRI {

    private URL imageUrl;
    private int fieldStrength;
    private LocalDate scanDate;

    public MRI(int fieldStrength, LocalDate scanDate){
        this.imageUrl = null;
        this.fieldStrength = fieldStrength;
        this.scanDate = scanDate;
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

    public int getFieldStrength() {
        return fieldStrength;
    }

    public LocalDate getScanDate() {
        return scanDate;
    }
}
