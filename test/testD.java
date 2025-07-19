/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;
import Entyty.detailKasir;
import service.detailKasirServices;
/**
 *
 * @author USER
 */
public class testD {
     public static void main(String[]args){
         detailKasirServices services = new detailKasirServices();
         List<detailKasir> list = services.TampilDetail();
       
       for (detailKasir M : list){
           System.out.println(M.getId_detail());
           System.out.println(M.getKode_masakan());
           System.out.println(M.getNama_masakan());
           System.out.println(M.getJumlah());
           System.out.println(M.getHarga());
           System.out.println(M.getTotal());
       }
}
}
