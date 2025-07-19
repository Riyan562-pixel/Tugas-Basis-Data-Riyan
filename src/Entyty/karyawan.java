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
public class karyawan {
 @TableColumn (number = 1, name ="id_karyawan")
    int id_karyawan;
  @TableColumn (number = 2, name ="nama_karyawan")
    String nama_karyawan;
   @TableColumn (number = 3, name ="ussername")
    String ussername;
    @TableColumn (number = 4, name ="Shift")
    int Shift;
    public int getId_karyawan() {
        return id_karyawan;
    }

    public void setId_karyawan(int id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    public String getNama_karyawan() {
        return nama_karyawan;
    }

    public void setNama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }

    public String getUssername() {
        return ussername;
    }

    public void setUssername(String ussername) {
        this.ussername = ussername;
    }

    public int getShift() {
        return Shift;
    }

    public void setShift(int Shift) {
        this.Shift = Shift;
    }

}
