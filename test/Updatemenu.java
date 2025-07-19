
import Entyty.menu;
import service.masakanservices;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Updatemenu {
public static void main (String[]args){
    menu Menu = new menu();
    Menu.setId_masakan(2);
    Menu.setKode_masakan("AY002");
    Menu.setNama_masakan("ayam goreng");
    Menu.setHarga(25000);
    Menu.setStock(10);
    masakanservices service = new masakanservices();
    service.InsertProduk(Menu);
    }
}
