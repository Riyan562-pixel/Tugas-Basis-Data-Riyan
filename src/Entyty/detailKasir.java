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
public class detailKasir {
     @TableColumn (number = 1, name ="id_detail")
    int id_detail;
        @TableColumn (number = 2, name ="kode_masakan")
    String kode_masakan;
            @TableColumn (number = 3, name ="nama_masakan")
    String nama_masakan;
                @TableColumn (number = 4, name ="jumlah")
    String jumlah;
                    @TableColumn (number = 5, name ="harga")
    String harga;
                        @TableColumn (number = 1, name ="total")
    String total;
    public int getId_detail() {
        return id_detail;
    }

    public void setId_detail(int id_detail) {
        this.id_detail = id_detail;
    }

    public String getKode_masakan() {
        return kode_masakan;
    }

    public void setKode_masakan(String kode_masakan) {
        this.kode_masakan = kode_masakan;
    }

    public String getNama_masakan() {
        return nama_masakan;
    }

    public void setNama_masakan(String nama_masakan) {
        this.nama_masakan = nama_masakan;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
