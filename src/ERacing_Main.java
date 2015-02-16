
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MarkusH
 */
public class ERacing_Main {

    /**
     *
     */
    public static void main(String[] args) {
        
        // test mitglied anlegen
        Mitglied m = new Mitglied();
        MitgliedDAO dao = new MitgliedDAO();
        
        dao.setNewMitglied("Max", "Mustermann", "3432423423", "max@holl", "PassauerStr. 4", 45454, "NähePassau", 1, "nicht dass ich wüsste", "andy@eracing", "LKW, Fahrrad", "ka", 0, 0, "Bayerisch/Deutsch", 1, "Vorstand");
        
        /*Connection con = null;
        ResultSet rs;
        Statement stmt;
        try {
            System.out.println("Verbindung mit Datenbank wird hergestellt.");
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.err.println("Treiber konnte nicht gefunden werden.");
            System.err.println(e.getMessage());
        }
        try {

            System.out.println("Verbindung ist hergestellt.");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAeRacing", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Mitglied");

            while (rs.next()) {
                try {
                    for (int i = 1;; i++) {
                        System.out.print(rs.getString(i) + "; ");
                    }
                } catch (Exception e) {
                    System.out.println("");
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());

        }*/

    }
}
