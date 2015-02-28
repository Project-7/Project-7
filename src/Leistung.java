/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Leistung {

    private int leistungID;
    private String leistung;
    private int leistung_in_Werteinheit;
    private String sonstiges;

    //Default Konstruktor
    public Leistung() {

    }

    public Leistung(int leistungID, String leistung, int leistung_in_Werteinheit, String sonstiges) {
        this.leistungID = leistungID;
        this.leistung = leistung;
        this.leistung_in_Werteinheit = leistung_in_Werteinheit;
        this.sonstiges = sonstiges;

    }

    public int getLeistungID() {
        return leistungID;
    }

    public void setLeistungID(int leistungID) {
        this.leistungID = leistungID;
    }

    public String getLeistung() {
        return leistung;
    }

    public void setLeistung(String leistung) {
        this.leistung = leistung;
    }

    public int getLeistung_in_Werteinheit() {
        return leistung_in_Werteinheit;
    }

    public void setLeistung_in_Werteinheit(int leistung_in_Werteinheit) {
        this.leistung_in_Werteinheit = leistung_in_Werteinheit;

    }

    public String getSonstiges() {
        return sonstiges;
    }

    public void setSonstiges(String sonsitges) {
        this.sonstiges = sonsitges;
    }
}
