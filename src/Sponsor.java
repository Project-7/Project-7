/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Sponsor {

    private int sponsorenID;
    private String unternehmen;
    private int kontakt_hergestellt;
    private int anfrage_Erfolg;
    private String info;
    private int weiterhin_anfragen;
    private String kategorie;
    private int sponsorenliste_FH;

    public Sponsor() {

    }

    public Sponsor(int sponsorenID, String unternehmen, int kontakt_hergestellt, int anfrage_Erfolg, String info, int weiterhin_anfragen,
            String kategorie, int sponsorenliste_FH) {

        this.sponsorenID = sponsorenID;
        this.unternehmen = unternehmen;
        this.kontakt_hergestellt = kontakt_hergestellt;
        this.anfrage_Erfolg = anfrage_Erfolg;
        this.info = info;
        this.weiterhin_anfragen = weiterhin_anfragen;
        this.kategorie = kategorie;
        this.sponsorenliste_FH = sponsorenliste_FH;

    }

    public int getSponsorenID() {
        return sponsorenID;
    }

    public void setSponsorenID(int sponsorenID) {
        this.sponsorenID = sponsorenID;
    }

    public String getUnternehmen() {
        return unternehmen;
    }

    public void setUnternehmen(String unternehmen) {
        this.unternehmen = unternehmen;
    }

    public int isKontakt_hergestellt() {
        return kontakt_hergestellt;
    }

    public void setKontakt_hergestellt(int kontakt_hergestellt) {
        this.kontakt_hergestellt = kontakt_hergestellt;
    }

    public int isAnfrage_Erfolg() {
        return anfrage_Erfolg;
    }

    public void setAnfrage_Erfolg(int anfrage_Erfolg) {
        this.anfrage_Erfolg = anfrage_Erfolg;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int isWeiterhin_anfragen() {
        return weiterhin_anfragen;
    }

    public void setWeiterhin_anfragen(int weiterhin_anfragen) {
        this.weiterhin_anfragen = weiterhin_anfragen;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public int isSponsorenliste_FH() {
        return sponsorenliste_FH;
    }

    public void setSponsorenliste_FH(int sponsorenliste_FH) {
        this.sponsorenliste_FH = sponsorenliste_FH;
    }

}
