/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teskoneksi;

/**
 *
 * @author Inside
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class teskoneksi {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]){
        try{
            String url = "jdbc:mysql://localhost/loketonline";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("Koneksi Berhasil");
        }catch(Exception e){
            System.err.println("Koneksi Gagal"+ e.getMessage());
        }
    }
}
