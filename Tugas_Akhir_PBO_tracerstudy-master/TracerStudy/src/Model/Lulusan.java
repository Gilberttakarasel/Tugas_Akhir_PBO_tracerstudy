/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Lulusan {
   private String id_lulusan;
   private String nama_lulusan;
   private String tanggal_lahir;
   private String jenjang;
   private String program_studi;
   private String email;
   private String alamat;
   private String no_tlp;
   private String ipk;

    public Lulusan() {
    }

    public Lulusan(String id_lulusan, String nama_lulusan, String tanggal_lahir, String jenjang, String program_studi, String email, String alamat, String no_tlp, String ipk) {
        this.id_lulusan = id_lulusan;
        this.nama_lulusan = nama_lulusan;
        this.tanggal_lahir = tanggal_lahir;
        this.jenjang = jenjang;
        this.program_studi = program_studi;
        this.email = email;
        this.alamat = alamat;
        this.no_tlp = no_tlp;
        this.ipk = ipk;
    }

    public String getId_lulusan() {
        return id_lulusan;
    }

    public void setId_lulusan(String id_lulusan) {
        this.id_lulusan = id_lulusan;
    }

    public String getNama_lulusan() {
        return nama_lulusan;
    }

    public void setNama_lulusan(String nama_lulusan) {
        this.nama_lulusan = nama_lulusan;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getJenjang() {
        return jenjang;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    public String getProgram_studi() {
        return program_studi;
    }

    public void setProgram_studi(String program_studi) {
        this.program_studi = program_studi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }

    public String getIpk() {
        return ipk;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "Lulusan{" + "id_lulusan=" + id_lulusan + ", nama_lulusan=" + nama_lulusan + ", tanggal_lahir=" + tanggal_lahir + ", jenjang=" + jenjang + ", program_studi=" + program_studi + ", email=" + email + ", alamat=" + alamat + ", no_tlp=" + no_tlp + ", ipk=" + ipk + '}';
    }
   
   
    
}
