/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.p2m;
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
public class ExecuteP2m {
    // get data
    public List<p2m> getAll(){
        List<p2m> myP2m = new ArrayList();
        String query = "Select * from p2m";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                p2m pm = new p2m ();
                pm.setId_p2m(rs.getString("id_p2m"));
                pm.setId_lulusan(rs.getString("id_lulusan"));
                pm.setJenis_p2m(rs.getString("jenis_p2m"));
                pm.setTempat(rs.getString("tempat"));
                myP2m.add(pm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteP2m.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return myP2m; 
    }
    // insert data 
    public int insertPm(p2m pm){
        int hasil = 0;
        String query = "insert into p2m(id_p2m, id_lulusan, jenis_p2m, tempat)"
                + "values('" + pm.getId_p2m()+ "', '" + pm.getId_lulusan()
                +"', '" + pm.getJenis_p2m()+ "', '" + pm.getTempat()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteP2m.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
}
