import java.net.URL;
import java.time.LocalDate;

public class MRI {

    private URL imageURL;
    private int fieldStrength;
    private LocalDate scanDate;

    public MRI(URL imageURL, int fieldStrength, LocalDate scanDate){
        this.imageURL = imageURL;
        this.fieldStrength = fieldStrength;
        this.scanDate = scanDate;
    }

    public URL getImageURL() {
        return imageURL;
    }

    public int getFieldStrength() {
        return fieldStrength;
    }

    public LocalDate getScanDate() {
        return scanDate;
    }
}
