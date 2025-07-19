


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.List;
import Entyty.menu;
import service.masakanservices;
/**
 *
 * @author USER
 */
public class tanpilmenu {
     public static void main(String[]args){
         masakanservices services = new masakanservices();
       List<menu> list =  services.TampilData();
       
       for (menu Menu : list){
           System.out.println(Menu.getId_menu());
           System.out.println(Menu.getId_masakan());
           System.out.println(Menu.getKode_masakan());
           System.out.println(Menu.getNama_masakan());
           System.out.println(Menu.getHarga());
           System.out.println(Menu.getStock());
           System.out.println("****************************");
       }
       }
}
