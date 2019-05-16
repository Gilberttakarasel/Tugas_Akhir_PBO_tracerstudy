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
public class ta {
    private String id_ta;
    private String id_lulusan;
    private String judul;
    private String pembimbing;

    public ta() {
    }

    public ta(String id_ta, String id_lulusan, String judul, String pembimbing) {
        this.id_ta = id_ta;
        this.id_lulusan = id_lulusan;
        this.judul = judul;
        this.pembimbing = pembimbing;
    }

    public String getId_ta() {
        return id_ta;
    }

    public void setId_ta(String id_ta) {
        this.id_ta = id_ta;
    }

    public String getId_lulusan() {
        return id_lulusan;
    }

    public void setId_lulusan(String id_lulusan) {
        this.id_lulusan = id_lulusan;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPembimbing() {
        return pembimbing;
    }

    public void setPembimbing(String pembimbing) {
        this.pembimbing = pembimbing;
    }

    @Override
    public String toString() {
        return "ta{" + "id_ta=" + id_ta + ", id_lulusan=" + id_lulusan + ", judul=" + judul + ", pembimbing=" + pembimbing + '}';
    }
    
    
    
}
