/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entyty;

import com.stripbandunk.jwidget.annotation.TableColumn;

/**
 *
 * @author USER
 */
public class datakasir {
@TableColumn (number = 1, name ="no_faktur")
    String no_faktur;
  @TableColumn (number = 2, name ="tanggal")
    String tanggal;
   @TableColumn (number = 3, name ="nama custemer")
    String nama_custemer;
    @TableColumn (number = 4, name ="total bayar")
    String total_beli;
    
    public String getno_faktur() {
        return no_faktur;
    }

    public void setno_faktur(String no_faktur) {
        this.no_faktur = no_faktur;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNama_custemer() {
        return nama_custemer;
    }

    public void setNama_custemer(String nama_custemer) {
        this.nama_custemer = nama_custemer;
    }

    public String getTotal_beli() {
        return total_beli;
    }

    public void setTotal_beli(String total_beli) {
        this.total_beli = total_beli;
    }

}
