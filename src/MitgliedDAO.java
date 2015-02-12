
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
        String insert = "INSERT INTO Mitglied VALUES (nextval('MitgliederID'),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String eingabe = "";
        try {
                System.out.println("Verbindung mit Datenbank wird hergestellt.");
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Verbindung ist hergestellt.");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LAeRacing", "root", "");
            } catch (Exception e) {
                System.err.println("Treiber konnte nicht gefunden werden.");
                System.err.println(e.getMessage());
            }
        
            
            try {
                System.out.println("Neus Mitglied anlegen:");
                pstmt = con.prepareStatement(insert);
                System.out.println("Vorname");
                eingabe = sc.nextLine();
                pstmt.setString(1, eingabe);
                System.out.println("Name:");
                eingabe = sc.nextLine();
                pstmt.setString(2, eingabe);
                System.out.println("Telefonnr.:");
                eingabe = sc.nextLine();
                pstmt.setString(3, eingabe);
                System.out.println("email:");
                eingabe = sc.nextLine();
                pstmt.setString(4, eingabe);
                System.out.println("Straße Hsnr.:");
                eingabe = sc.nextLine();
                pstmt.setString(5, eingabe);
                System.out.println("PLZ");
                //eingabe = sc.nextLine();
                pstmt.setInt(6, Integer.parseInt(sc.nextLine()));
                System.out.println("Ort");
                eingabe = sc.nextLine();
                pstmt.setString(7, eingabe);
                System.out.println("angemeldet JA/Nein:");
                eingabe = sc.nextLine();
                pstmt.setBoolean(8, Boolean.parseBoolean(eingabe));
                System.out.println("Studium Generale");
                eingabe = sc.nextLine();
                pstmt.setString(9, eingabe);
                System.out.println("email-eRacing:");
                eingabe = sc.nextLine();
                pstmt.setString(10, eingabe);
                System.out.println("Führerscheinklasse:");
                eingabe = sc.nextLine();
                pstmt.setString(11, eingabe);
                System.out.println("Vermerk:");
                eingabe = sc.nextLine();
                pstmt.setString(12, eingabe);
                System.out.println("Werkstattregeln gelesen JA/NEIN:");
                eingabe = sc.nextLine();
                pstmt.setBoolean(13, Boolean.parseBoolean(eingabe));
                System.out.println("Serverzugang JA/NEIN:");
                eingabe = sc.nextLine();
                pstmt.setBoolean(14, Boolean.parseBoolean(eingabe));
                System.out.println("Staatsangehörigkeit:");
                eingabe = sc.nextLine();
                pstmt.setString(15, eingabe);
                System.out.println("Foto vorhanden JA/NEIN:");
                eingabe = sc.nextLine();
                pstmt.setBoolean(16, Boolean.parseBoolean(eingabe));
                System.out.println("Position (Vorstand, Teamleiter, Teammitglied, Mitglied");
                eingabe = sc.nextLine();
                pstmt.setString(17, eingabe); 
                
                
                if (pstmt.executeUpdate() != 0) {
                    System.out.println("Eine neue Bestellung wurde angelegt.");
                } else {
                    System.out.println("Es wurde keine Bestellung angelegt.");
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
