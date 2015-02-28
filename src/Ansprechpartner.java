
/**
 *
 * @author david
 */
public class Ansprechpartner extends Person {

    private int ansprechpartnerID;
    private int ansprechpartner_eRacing;
    private String tätigkeit;

    public Ansprechpartner(String vorname, String name, String telefonnr, String email, String strasse_Hsnr, int plz, String ort, int ansprechpartnerID, int ansprechpartner_eRacing, String tätigkeit) {
        super(vorname, name, telefonnr, email, strasse_Hsnr, plz, ort);
        this.ansprechpartnerID = ansprechpartnerID;
        this.ansprechpartner_eRacing = ansprechpartner_eRacing;
        this.tätigkeit = tätigkeit;
    }

    public int setAnsprechpartnerID() {
        return ansprechpartnerID;
    }

    public void setAnsprechpartnerID(int ansprechpartnerID) {
        this.ansprechpartnerID = ansprechpartnerID;
    }

    public int getAnsprechpartner_eRacing() {
        return ansprechpartner_eRacing;
    }

    public void setAnsprechpartner_eRacing(int ansprechpartner_eRacing) {
        this.ansprechpartner_eRacing = ansprechpartner_eRacing;
    }

    public String getTätigkeit() {
        return tätigkeit;
    }

    public void setTätigkeit(String tätigkeit) {
        this.tätigkeit = tätigkeit;
    }
}
