/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class koneksi {
        private static Connection koneksi;
    public static Connection getkoneksi(){
        if(koneksi==null){
            try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            
            String url = "jdbc:mysql://localhost:3306/warung_sedap_malam";
            String user = "root";
            String pas = "";
            
            koneksi = DriverManager.getConnection(url,user,pas);
            System.out.println("Koneksi berhasil cuyy");
                
            }catch(SQLException e){
                System.out.println("koneksi gagal"+e);
            }
        }
        return koneksi;
    }
}
