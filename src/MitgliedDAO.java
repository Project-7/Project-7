
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
 * @author Project 7
 */
public class MitgliedDAO {
    
    public void setNewMitglied(Mitglied m){
    
        //TODO: zu insert umbaun!!
        
        Connection con = null;
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
            rs = stmt.executeQuery("INSERT "); //INSERT machen

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

        }
        
    } 
    
}
