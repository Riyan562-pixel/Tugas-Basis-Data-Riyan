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
import Entyty.menu;
import javax.swing.JOptionPane;
import service.koneksi;
/**
 *
 * @author USER
 */
public class masakanservices {
     public Connection Koneksi;
    
    public masakanservices(){
    Koneksi = koneksi.getkoneksi();
    }
    public List<menu> TampilData(){
    PreparedStatement prepare = null;
    ResultSet result = null;
    
    List<menu>list = new ArrayList<>();
    try{
    String sql = "select * from menu_masakan";
    prepare = Koneksi.prepareStatement(sql);
    result = prepare.executeQuery();
    
    while(result.next()){
      menu Menu = new menu();
      Menu.setId_menu(result.getInt("Id_menu"));
      Menu.setId_masakan(result.getInt("Id_masakan"));
      Menu.setKode_masakan(result.getString("Kode_masakan"));
      Menu.setNama_masakan(result.getString("Nama_masakan"));
      Menu.setHarga(result.getInt("harga"));
      Menu.setStock(result.getInt("Stock"));
      list.add (Menu);
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
public void InsertProduk(menu Menu){
    PreparedStatement prepare = null;
    
    try{
        String sql ="INSERT INTO menu_masakan(id_menu,id_masakan,kode_masakan,nama_masakan,harga,stock)"+ "VALUES(null,?,?,?,?,?)";
        prepare = Koneksi.prepareStatement(sql);
        prepare.setInt(1,Menu.getId_masakan());
        prepare.setString(2,Menu.getKode_masakan());
        prepare.setString(3,Menu.getNama_masakan());
        prepare.setInt(4,Menu.getHarga());
        prepare.setInt(5,Menu.getStock());
        prepare.executeUpdate();
       
    }catch(SQLException e){
        System.err.println("gagal insert dengan kesalahan = "+ e);
    }finally{
        if(prepare !=null){
        try{
            prepare.close();
        }catch(SQLException e ){
            System.err.println("ada kesalah mohon di cek" + e);
        }
        }
    }
}
public void Update_Produk(menu Menu){
    PreparedStatement prepare = null;
    
    try{
        String sql = "UPDATE menu_masakan SET id_masakan= ?,kode_masakan= ?,nama_masakan= ?,Harga= ?," + "Stock= ? where id_menu= ? ";
        prepare = Koneksi .prepareStatement(sql);
        prepare.setInt(1,Menu.getId_masakan());
        prepare.setString(2,Menu.getKode_masakan());
        prepare.setString(3,Menu.getNama_masakan());
        prepare.setInt(4,Menu.getHarga());
        prepare.setInt(5,Menu.getStock());
        prepare.setInt(6,Menu.getId_menu());
        prepare.executeUpdate();
        JOptionPane.showMessageDialog(null,"update berhasil");
    }catch(SQLException e ){
        System.out.println("gagal di update terjadi kesalahan" + e );
    }finally{
        if(prepare!=null){
            try{
                prepare.close();
            }catch(SQLException ex){
            
            }
        }
    }
    
}
public void Delte_menu(int id_menu){
    PreparedStatement prepare = null;
    try {
        String sql ="DELETE FROM menu_masakan WHERE id_menu = ?";
        prepare = Koneksi.prepareStatement(sql);
        
        prepare.setInt(1,id_menu);
        
        prepare.executeUpdate();
    } catch (Exception ex) {
        System.err.println("Gagal di delete error"+ex);
    }finally{
        if(prepare !=null){
            try {
                prepare.close();
            } catch (Exception e) {
            }
        }
    }
}
}
