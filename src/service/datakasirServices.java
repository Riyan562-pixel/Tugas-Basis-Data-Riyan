/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entyty.datakasir;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class datakasirServices {
     public Connection Koneksi;
    
    public datakasirServices(){
    Koneksi = koneksi.getkoneksi();
    }
    public List<datakasir> TampilDatakasir(){
    PreparedStatement prepare = null;
    ResultSet result = null;
    
    List<datakasir>list = new ArrayList<>();
    try{
    String sql = "select * from datakasir";
    prepare = Koneksi.prepareStatement(sql);
    result = prepare.executeQuery();
    
    while(result.next()){
      datakasir M = new datakasir();
      M.setno_faktur(result.getString("no_faktur"));
      M.setTanggal(result.getString("tanggal"));
      M.setNama_custemer(result.getString("nama_custemer"));
      M.setTotal_beli(result.getString("Total_beli"));
      list.add (M);
    }
    return list;
}catch(SQLException e){
    System.out.println("keterangan"+e);
    return list;
}finally{
    if(prepare !=null){
        try{
            prepare.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    if (result != null){
    try{
        result.close();
    }catch(SQLException e){
        System.out.println(e);
    }
}
    }
    }

}
