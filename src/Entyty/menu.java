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
public class menu {
    @TableColumn (number = 1, name ="id_menu")
    int id_menu;
        @TableColumn (number = 2, name ="id_masakan")
    int id_masakan;
            @TableColumn (number = 3, name ="kode_masakan")
    String kode_masakan;
                @TableColumn (number = 4, name ="nama_masakan")
    String nama_masakan;
                    @TableColumn (number = 5, name ="harga")
    int harga;
                        @TableColumn (number = 1, name ="stock")
    int stock;
    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public int getId_masakan() {
        return id_masakan;
    }

    public void setId_masakan(int id_masakan) {
        this.id_masakan = id_masakan;
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

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
