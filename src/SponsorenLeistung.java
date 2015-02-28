
/**
 *
 * @author david
 */
public class SponsorenLeistung {

    private int sponsorenID;
    private int leistungID;

    public SponsorenLeistung() {

    }

    public SponsorenLeistung(int sponsorenID, int leistungID) {
        this.sponsorenID = sponsorenID;
        this.leistungID = leistungID;
    }

    public int getSponsorenID() {
        return sponsorenID;
    }

    public void setSponsorenID(int sponsorenID) {
        this.sponsorenID = sponsorenID;
    }

    public int getLeistungID() {
        return leistungID;
    }

    public void setLeistungID(int leistungID) {
        this.leistungID = leistungID;

    }

}
