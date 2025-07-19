/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Entyty.menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entyty.detailKasir;

/**
 *
 * @author USER
 */

    public class detailKasirServices {
     public Connection Koneksi;
    
    public detailKasirServices(){
    Koneksi = koneksi.getkoneksi();
    }
    public List<detailKasir> TampilDetail(){
    PreparedStatement prepare = null;
    ResultSet result = null;
    
    List<detailKasir>list = new ArrayList<>();
    try{
    String sql = "select * from detail_pembelian";
    prepare = Koneksi.prepareStatement(sql);
    result = prepare.executeQuery();
    
    while(result.next()){
       detailKasir M = new detailKasir();
      M.setId_detail(result.getInt("Id_detail"));
      M.setKode_masakan(result.getString("kode_masakan"));
      M.setNama_masakan(result.getString("nama_masakan"));
      M.setJumlah(result.getString("jumlah"));
      M.setHarga(result.getString("harga"));
      M.setTotal(result.getString("total"));
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

