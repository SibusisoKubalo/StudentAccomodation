/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.studentacc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Sibusisos
 */
public class DbConnection {
    Connection conn = null;
    
    public static Connection ConnectDb(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Database\\.db");
            System.out.println("Connection Succeeded");
            return conn;
        }
        catch(Exception e) {
            System.out.println("Connection failed" + e);
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
