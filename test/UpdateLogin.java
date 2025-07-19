/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Entyty.login;
import service.loginservices;
/**
 *
 * @author USER
 */
public class UpdateLogin {
     public static void main (String[]args){
     login M = new login();
     M.setId_karyawan(4);
     M.setUssername("kitakuat");
     M.setpassword("123");
     loginservices service = new loginservices();
     service.Insertlogin(M);
     }
}
