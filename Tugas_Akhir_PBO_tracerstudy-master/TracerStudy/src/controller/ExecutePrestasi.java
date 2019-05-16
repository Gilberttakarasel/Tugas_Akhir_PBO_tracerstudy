/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.prestasi;
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
public class ExecutePrestasi {
     // get data
    public List<prestasi> getAll(){
        List<prestasi> myPrestasi = new ArrayList();
        String query = "Select * from prestasi";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                prestasi pts = new prestasi ();
                pts.setId_prestasi(rs.getString("id_prestasi"));
                pts.setId_lulusan(rs.getString("id_lulusan"));
                pts.setJenis_prestasi(rs.getString("jenis_prestasi"));
                pts.setNama_kegiatan(rs.getString("nama_kegiatan"));
                pts.setPeringkat(rs.getString("peringkat"));
                myPrestasi.add(pts);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePrestasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return myPrestasi; 
    }
    // insert data 
    public int insertPts(prestasi pts){
        int hasil = 0;
        String query = "insert into prestasi(id_prestasi, id_lulusan, jenis_prestasi, nama_kegiatan, peringkat)"
                + "values('" + pts.getId_prestasi()+ "', '" + pts.getId_lulusan()
                +"', '" + pts.getJenis_prestasi()+ "', '" + pts.getNama_kegiatan()+ "', '" + pts.getPeringkat()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePrestasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
}
