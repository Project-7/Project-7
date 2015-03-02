/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Marketingmassnahme {

    private int marketingID;
    private int logo_auf_HP_Roll_up;
    private int logo_auf_D;
    private int sponsoringplakat;
    private int logo_auf_Plakat;
    private int artikel_auf_Homepage;
    private int newsletter;
    private int kalender;
    private int auf_SKB_besucht;

    public Marketingmassnahme() {

    }

    public Marketingmassnahme(int marketingID, int logo_auf_HP_Roll_up, int logo_auf_D, int sponsoringplakat, int logo_auf_Plakat,
            int artikel_auf_Homepage, int newsletter, int kalender, int auf_SKB_besucht) {

        this.marketingID = marketingID;
        this.logo_auf_HP_Roll_up = logo_auf_HP_Roll_up;
        this.sponsoringplakat = sponsoringplakat;
        this.logo_auf_Plakat = logo_auf_Plakat;
        this.artikel_auf_Homepage = artikel_auf_Homepage;
        this.newsletter = newsletter;
        this.kalender = kalender;
        this.auf_SKB_besucht = auf_SKB_besucht;

    }

    public int getMarketingID() {
        return marketingID;
    }

    public void setMarketingID(int marketingID) {
        this.marketingID = marketingID;
    }

    public int isLogo_auf_HP_Roll_up() {
        return logo_auf_HP_Roll_up;
    }

    public void setLogo_auf_HP_Roll_up(int logo_auf_HP_Roll_up) {
        this.logo_auf_HP_Roll_up = logo_auf_HP_Roll_up;
    }

    public int getSponsoringplakat() {
        return sponsoringplakat;
    }

    public void setSponsoringplakat(int sponsoringplakat) {
        this.sponsoringplakat = sponsoringplakat;
    }

    public int isLogo_auf_Plakat() {
        return logo_auf_Plakat;
    }

    public void setLogo_auf_Plakat(int logo_auf_Plakat) {
        this.logo_auf_Plakat = logo_auf_Plakat;
    }

    public int isArtikel_auf_Homepage() {
        return artikel_auf_Homepage;
    }

    public void setArtikel_auf_Homepage(int artikel_auf_Homepage) {
        this.artikel_auf_Homepage = artikel_auf_Homepage;
    }

    public int isNewsletter() {
        return newsletter;
    }

    public void setNewsletter(int newsletter) {
        this.newsletter = newsletter;
    }

    public int isKalender() {
        return kalender;
    }

    public void setKalender(int kalender) {
        this.kalender = kalender;
    }

    public int isAuf_SKB_besucht() {
        return auf_SKB_besucht;
    }

    public void setAuf_SKB_besucht(int auf_SKB_besucht) {
        this.auf_SKB_besucht = auf_SKB_besucht;
    }
}
