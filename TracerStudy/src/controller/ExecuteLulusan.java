/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Lulusan;
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
public class ExecuteLulusan {
    // get data
    public List<Lulusan> getAll(){
        List<Lulusan> myLulusan = new ArrayList();
        String query = "Select * from lulusan";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Lulusan lsn = new Lulusan ();
                lsn.setId_lulusan(rs.getString("id_lulusan"));
                lsn.setNama_lulusan(rs.getString("nama_lulusan"));
                lsn.setTanggal_lahir(rs.getString("tanggal_lahir"));
                lsn.setJenjang(rs.getString("jenjang"));
                lsn.setProgram_studi(rs.getString("program_studi"));
                lsn.setEmail(rs.getString("email"));
                lsn.setAlamat(rs.getString("alamat"));
                lsn.setNo_tlp(rs.getString("no_tlp"));
                lsn.setIpk(rs.getString("ipk"));
                myLulusan.add(lsn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteLulusan.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return myLulusan; 
    }
    // insert data 
    public int insertLsn(Lulusan lsn){
        int hasil = 0;
        String query = "insert into lulusan(id_lulusan, nama_lulusan, tanggal_lahir, jenjang, program_studi, email, alamat, no_tlp, ipk)"
                + "values('" + lsn.getId_lulusan()+ "', '" + lsn.getNama_lulusan()
                +"', '" + lsn.getTanggal_lahir()+ "', '" + lsn.getJenjang()+ "', '" + lsn.getProgram_studi()+"', '" + lsn.getEmail()+"', '" + lsn.getAlamat()+"', '" + lsn.getNo_tlp()+"', '" + lsn.getIpk()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteLulusan.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
          
}
