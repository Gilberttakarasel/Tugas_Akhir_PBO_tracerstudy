/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Pekerjaan;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class ExecutePekerjaan {
     // get data
    public List<Pekerjaan> getAll(){
        List<Pekerjaan> myPekerjaan = new ArrayList();
        String query = "Select * from pekerjaan";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Pekerjaan pkj = new Pekerjaan ();
                pkj.setId_pekerjaan(rs.getString("id_pekerjaan"));
                pkj.setId_lulusan(rs.getString("id_lulusan"));
                pkj.setJenis_pekerjaan(rs.getString("jenis_pekerjaan"));
                pkj.setAlamat_pekerjaan(rs.getString("Alamat_pekerjaan"));
                myPekerjaan.add(pkj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePekerjaan.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return myPekerjaan; 
    }
    // insert data 
    public int insertPkj(Pekerjaan pkj){
        int hasil = 0;
        String query = "insert into pekerjaan(id_pekerjaan, id_lulusan, jenis_pekerjaan, alamat_pekerjaaan)"
                + "values('" + pkj.getId_pekerjaan()+ "', '" + pkj.getId_lulusan()
                +"', '" + pkj.getJenis_pekerjaan()+ "', '" + pkj.getAlamat_pekerjaan()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePekerjaan.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
}
