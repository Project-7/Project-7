
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MarkusH / RobertK
*
 */
public class MitgliedDAO {

    public void setNewMitglied(Mitglied m) {

        //TODO: zu insert umbaun!!
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        ResultSet rs;
        PreparedStatement pstmt;
        String insert = "INSERT INTO Mitglied VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String eingabe = "";
        try {
                System.out.println("Verbindung mit Datenbank wird hergestellt.");
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Verbindung ist hergestellt.");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAeRacing", "root", "0000");
            } catch (Exception e) {
                System.err.println("Treiber konnte nicht gefunden werden.");
                System.err.println(e.getMessage());
            }
        
            
            try {
                eingabe = sc.nextLine();
                while(eingabe != "exit") {
                pstmt = con.prepareStatement(insert);
                pstmt.setBoolean(1, Boolean.parseBoolean(eingabe));
                pstmt.setString(2, eingabe);
                pstmt.setString(3, eingabe);
                pstmt.setString(4, eingabe);
                pstmt.setString(5, eingabe);
                pstmt.setString(5, eingabe);
                pstmt.setBoolean(6, Boolean.parseBoolean(eingabe));
                pstmt.setBoolean(7, Boolean.parseBoolean(eingabe));
                pstmt.setString(8, eingabe);
                pstmt.setBoolean(10, Boolean.parseBoolean(eingabe));
                pstmt.setString(11, eingabe);
                pstmt.setString(12, eingabe);
                pstmt.setString(13, eingabe);
                pstmt.setString(14, eingabe);
                pstmt.setString(15, eingabe);
                pstmt.setInt(16, Integer.parseInt(eingabe));
                pstmt.setString(17, eingabe); 

                if (pstmt.executeUpdate() != 0) {
                    System.out.println("Eine neue Bestellung wurde angelegt.");
                } else {
                    System.out.println("Es wurde keine Bestellung angelegt.");
                }
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());

            }
        
    }
    /*public void datenAusgeben(){
    
        
     }
    
    
     public void neuesMitglied(){
    
       
     int id=4;
     String vorname = "";
     String nachname = "";
     /*String vorname = "";
     String vorname = "";
     String vorname = "";
     String vorname = "";
     String vorname = "";
     String vorname = "";
        
        
     while (true) {

     System.out.println("Bitte Mitgliedsdaten eingeben. Wenn Sie mit Ihrer Abfrage fertig sind, verlassen Sie das Programm mit exit");
     System.out.println("Vorname");
     Scanner sc = new Scanner(System.in);
     vorname = sc.nextLine();
     System.out.println("Nachname");
     nachname = sc.nextLine();

     if (!sc.equals("exit")) {
     PreparedStatement pstmt = con.prepareStatement("INSERT INTO Mitglied VALUES (?,?)");
     pstmt.setInt(1, );
     pstmt.setString(2, setVorname(mitglied));
     ResultSet rs = pstmt.executeQuery();
     id++;
     while (rs.next()) {
                    
     }
               
     } else 
     return;
     }
    
     }*/

}
