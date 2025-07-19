/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import Entyty.login;
/**
 *
 * @author USER
 */
public class loginservices {
    private  Connection Koneksi;
        public login ceklogin(String Ussername,String password){
        Koneksi = koneksi.getkoneksi();
        PreparedStatement prepare = null;
        ResultSet result = null;
        login Login = null;
        
            try {
                String sql ="Select * from login where Ussername = ? and password = ?";
                prepare = Koneksi.prepareStatement(sql);
                
                prepare.setString(1,Ussername);
                prepare.setString(2,password);
                result = prepare.executeQuery();
                if(result.next()){
                    Login = new login();
                    Login.setId(result.getInt("id"));
                    Login.setId_karyawan(result.getInt("ID_karyawan"));
                    Login.setUssername(result.getString("Ussername"));
                    Login.setpassword(result.getString("password"));
                }
                return Login;
            } catch (Exception ex) {
                System.out.println("ada yng salah dengan query"+ex);
                return Login;
            }finally{
                if (prepare !=null){
                    try {
                        prepare.close();
                    } catch (Exception e) {
                    }
                }
                if(result !=null){
                    try {
                         result.close();
                    } catch (Exception e) {
                    }
                }
            }
        }
    public void Insertlogin(login M){
    PreparedStatement prepare = null;
     Koneksi = koneksi.getkoneksi();
    try{
        String sql ="INSERT INTO login(id,id_karyawan,Ussername,password)"+ "VALUES(null,?,?,?)";
        prepare = Koneksi.prepareStatement(sql);
        prepare.setInt(1,M.getId_karyawan());
        prepare.setString(2,M.getUssername());
        prepare.setString(3,M.getpassword());
        prepare.executeUpdate();
       
    }catch(SQLException e){
        System.err.println("gagal insert dengan kesalahan = "+ e);
    }finally{
        if(prepare !=null){
        try{
            prepare.close();
        }catch(SQLException e ){
            System.err.println("ada kesalah mohon di cek" + e);
        }
        }
    }
}
}
