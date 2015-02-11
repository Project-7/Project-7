
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalya
 */
public class Mitglied extends Person{
    
    private int mitgliederID;
    private boolean angemeldet;
    private String studiumGenerale;
    private String email_eRacing;
    private String fuererschein;
    private String vermerk;
    private boolean werkstattregeln;
    private boolean serverzugang;
    private String staatsangehoerigkeit;
    private boolean foto_vorhanden;
    private String Position;
    //private Object con = ERacing_Main.verbindungsaufbau();

    public int getMitgliederID() {
        return mitgliederID;
    }

    public boolean isAngemeldet() {
        return angemeldet;
    }

    public String getStudiumGenerale() {
        return studiumGenerale;
    }

    public String getEmail_eRacing() {
        return email_eRacing;
    }

    public String getFuererschein() {
        return fuererschein;
    }

    public String getVermerk() {
        return vermerk;
    }

    public boolean isWerkstattregeln() {
        return werkstattregeln;
    }

    public boolean isServerzugang() {
        return serverzugang;
    }

    public String getStaatsangehoerigkeit() {
        return staatsangehoerigkeit;
    }

    public boolean isFoto_vorhanden() {
        return foto_vorhanden;
    }

    public String getPosition() {
        return Position;
    }

    public void setAngemeldet(boolean angemeldet) {
        this.angemeldet = angemeldet;
    }

    public void setStudiumGenerale(String studiumGenerale) {
        this.studiumGenerale = studiumGenerale;
    }

    public void setEmail_eRacing(String email_eRacing) {
        this.email_eRacing = email_eRacing;
    }

    public void setFuererschein(String fuererschein) {
        this.fuererschein = fuererschein;
    }

    public void setVermerk(String vermerk) {
        this.vermerk = vermerk;
    }

    public void setWerkstattregeln(boolean werkstattregeln) {
        this.werkstattregeln = werkstattregeln;
    }

    public void setServerzugang(boolean serverzugang) {
        this.serverzugang = serverzugang;
    }

    public void setStaatsangehoerigkeit(String staatsangehoerigkeit) {
        this.staatsangehoerigkeit = staatsangehoerigkeit;
    }

    public void setFoto_vorhanden(boolean foto_vorhanden) {
        this.foto_vorhanden = foto_vorhanden;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public Mitglied(){
           //default constr
    }
    
    public Mitglied(int mitgliederID, boolean angemeldet, String studiumGenerale, String email_eRacing, String fuererschein, String vermerk, boolean werkstattregeln, boolean serverzugang, String staatsangehoerigkeit, boolean foto_vorhanden, String Position, String vorname, String nachname, String telefonnr, String email, String strasseHsnr, int plz, String ort) {
        super(vorname, nachname, telefonnr, email, strasseHsnr, plz, ort);
        this.mitgliederID = mitgliederID;
        this.angemeldet = angemeldet;
        this.studiumGenerale = studiumGenerale;
        this.email_eRacing = email_eRacing;
        this.fuererschein = fuererschein;
        this.vermerk = vermerk;
        this.werkstattregeln = werkstattregeln;
        this.serverzugang = serverzugang;
        this.staatsangehoerigkeit = staatsangehoerigkeit;
        this.foto_vorhanden = foto_vorhanden;
        this.Position = Position;
    } 
}
