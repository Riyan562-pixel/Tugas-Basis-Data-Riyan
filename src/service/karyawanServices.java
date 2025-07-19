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
import Entyty.karyawan;
import javax.swing.JOptionPane;
import service.koneksi;
/**
 *
 * @author USER
 */
public class karyawanServices {
     public Connection Koneksi;
    
    public karyawanServices(){
    Koneksi = koneksi.getkoneksi();
    }
    public List<karyawan> TampilData(){
    PreparedStatement prepare = null;
    ResultSet result = null;
    
    List<karyawan>list = new ArrayList<>();
    try{
    String sql = "select * from karyawan";
    prepare = Koneksi.prepareStatement(sql);
    result = prepare.executeQuery();
    
    while(result.next()){
      karyawan M = new karyawan();
      M.setId_karyawan(result.getInt("Id_karyawan"));
      M.setNama_karyawan(result.getString("nama_karyawan"));
      M.setUssername(result.getString("Ussername"));
      M.setShift(result.getInt("Shift"));
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
public void Insertkaryawan(karyawan M){
    PreparedStatement prepare = null;
    
    try{
        String sql ="INSERT INTO karyawan(id_karyawan,nama_karyawan,ussername,shift)"+ "VALUES(?,?,?,?)";
        prepare = Koneksi.prepareStatement(sql);
        prepare.setInt(1,M.getId_karyawan());
        prepare.setString(2,M.getNama_karyawan());
        prepare.setString(3,M.getUssername());
        prepare.setInt(4,M.getShift());
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
public void Update_karyawan(karyawan M){
    PreparedStatement prepare = null;
    
    try{
        String sql = "UPDATE karyawan SET nama_karyawan= ?,ussername= ?,shift= ? where id_karyawan= ? ";
        prepare = Koneksi .prepareStatement(sql);
        prepare.setInt(1,M.getId_karyawan());
        prepare.setString(2,M.getNama_karyawan());
        prepare.setString(3,M.getUssername());
        prepare.setInt(4,M.getShift());
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
public void Delte_menu(int id_karyawan){
    PreparedStatement prepare = null;
    try {
        String sql ="DELETE FROM karyawan WHERE id_karyawan = ?";
        prepare = Koneksi.prepareStatement(sql);
        
        prepare.setInt(1,id_karyawan);
        
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