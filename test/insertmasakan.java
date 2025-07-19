/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Entyty.menu;
import service.masakanservices;

/**
 *
 * @author USER
 */
public class insertmasakan {
    public static void main (String[]args){
    menu Menu = new menu();
    Menu.setId_masakan(4);
    Menu.setKode_masakan("ay002");
    Menu.setNama_masakan("ayam goreng");
    Menu.setHarga(25000);
    Menu.setStock(20);
    masakanservices service = new masakanservices();
    service.InsertProduk(Menu);
    }
}
