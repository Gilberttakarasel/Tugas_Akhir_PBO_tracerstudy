/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;



/**
 *
 * @author Lenovo
 */
public class ConnectionManager {

    public static Object getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection con;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/tracerstudy";
    private String username = "root";
    private String password = "";
    
    public Connection logOn(){
        try{
            //Load JDBC Driver
            Class.forName(driver).newInstance();
            //Buat object connection
            con = DriverManager.getConnection(url, username, password);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
    
    public void logOff(){
        try{
            //Tutup koneksi
            con.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

   
    
}
