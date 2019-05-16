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
public class prestasi {
    private String id_prestasi;
    private String id_lulusan;
    private String jenis_prestasi;
    private String nama_kegiatan;
    private String peringkat;

    public prestasi() {
    }

    public prestasi(String id_prestasi, String id_lulusan, String jenis_prestasi, String nama_kegiatan, String peringkat) {
        this.id_prestasi = id_prestasi;
        this.id_lulusan = id_lulusan;
        this.jenis_prestasi = jenis_prestasi;
        this.nama_kegiatan = nama_kegiatan;
        this.peringkat = peringkat;
    }

    public String getId_prestasi() {
        return id_prestasi;
    }

    public void setId_prestasi(String id_prestasi) {
        this.id_prestasi = id_prestasi;
    }

    public String getId_lulusan() {
        return id_lulusan;
    }

    public void setId_lulusan(String id_lulusan) {
        this.id_lulusan = id_lulusan;
    }

    public String getJenis_prestasi() {
        return jenis_prestasi;
    }

    public void setJenis_prestasi(String jenis_prestasi) {
        this.jenis_prestasi = jenis_prestasi;
    }

    public String getNama_kegiatan() {
        return nama_kegiatan;
    }

    public void setNama_kegiatan(String nama_kegiatan) {
        this.nama_kegiatan = nama_kegiatan;
    }

    public String getPeringkat() {
        return peringkat;
    }

    public void setPeringkat(String peringkat) {
        this.peringkat = peringkat;
    }

    @Override
    public String toString() {
        return "prestasi{" + "id_prestasi=" + id_prestasi + ", id_lulusan=" + id_lulusan + ", jenis_prestasi=" + jenis_prestasi + ", nama_kegiatan=" + nama_kegiatan + ", peringkat=" + peringkat + '}';
    }
    
    
}
