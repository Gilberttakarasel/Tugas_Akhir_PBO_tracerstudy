/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.ta;
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
public class ExecuteTa {
    // get data
    public List<ta> getAll(){
        List<ta> myTa = new ArrayList();
        String query = "Select * from ta";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                ta t = new ta ();
                t.setId_ta(rs.getString("id_ta"));
                t.setId_lulusan(rs.getString("id_lulusan"));
                t.setJudul(rs.getString("judul"));
                t.setPembimbing(rs.getString("pembimbing"));
                myTa.add(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteTa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return myTa; 
    }
    // insert data 
    public int insertT(ta t){
        int hasil = 0;
        String query = "insert into ta(id_ta, id_lulusan, judul, pembimbing)"
                + "values('" + t.getId_ta()+ "', '" + t.getId_lulusan()
                +"', '" + t.getJudul()+ "', '" + t.getPembimbing()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteTa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
}
