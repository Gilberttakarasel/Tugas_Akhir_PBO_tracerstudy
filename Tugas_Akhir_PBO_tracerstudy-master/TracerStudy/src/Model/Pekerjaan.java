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
public class Pekerjaan {
    private String id_pekerjaan;
    private String id_lulusan;
    private String jenis_pekerjaan;
    private String alamat_pekerjaan;

    public Pekerjaan() {
    }

    public Pekerjaan(String id_pekerjaan, String id_lulusan, String jenis_pekerjaan, String alamat_pekerjaan) {
        this.id_pekerjaan = id_pekerjaan;
        this.id_lulusan = id_lulusan;
        this.jenis_pekerjaan = jenis_pekerjaan;
        this.alamat_pekerjaan = alamat_pekerjaan;
    }

    public String getId_pekerjaan() {
        return id_pekerjaan;
    }

    public void setId_pekerjaan(String id_pekerjaan) {
        this.id_pekerjaan = id_pekerjaan;
    }

    public String getId_lulusan() {
        return id_lulusan;
    }

    public void setId_lulusan(String id_lulusan) {
        this.id_lulusan = id_lulusan;
    }

    public String getJenis_pekerjaan() {
        return jenis_pekerjaan;
    }

    public void setJenis_pekerjaan(String jenis_pekerjaan) {
        this.jenis_pekerjaan = jenis_pekerjaan;
    }

    public String getAlamat_pekerjaan() {
        return alamat_pekerjaan;
    }

    public void setAlamat_pekerjaan(String alamat_pekerjaan) {
        this.alamat_pekerjaan = alamat_pekerjaan;
    }

    @Override
    public String toString() {
        return "Pekerjaan{" + "id_pekerjaan=" + id_pekerjaan + ", id_lulusan=" + id_lulusan + ", jenis_pekerjaan=" + jenis_pekerjaan + ", alamat_pekerjaan=" + alamat_pekerjaan + '}';
    }
    
    
}
