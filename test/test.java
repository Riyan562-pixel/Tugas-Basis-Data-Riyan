/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;
import Entyty.datakasir;
import service.datakasirServices;

/**
 *
 * @author USER
 */
public class test {
     public static void main(String[]args){
         datakasirServices services = new datakasirServices();
       List<datakasir> list =  services.TampilDatakasir();
       
       for (datakasir M : list){
           System.out.println(M.getno_faktur());
           System.out.println(M.getTanggal());
           System.out.println(M.getNama_custemer());
           System.out.println(M.getTotal_beli());
       }
}
}
