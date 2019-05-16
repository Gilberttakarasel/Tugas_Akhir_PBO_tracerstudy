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
public class p2m {
    private String id_p2m;
    private String id_lulusan;
    private String jenis_p2m;
    private String tempat;

    public p2m() {
    }

    public p2m(String id_p2m, String id_lulusan, String jenis_p2m, String tempat) {
        this.id_p2m = id_p2m;
        this.id_lulusan = id_lulusan;
        this.jenis_p2m = jenis_p2m;
        this.tempat = tempat;
    }

    public String getId_p2m() {
        return id_p2m;
    }

    public void setId_p2m(String id_p2m) {
        this.id_p2m = id_p2m;
    }

    public String getId_lulusan() {
        return id_lulusan;
    }

    public void setId_lulusan(String id_lulusan) {
        this.id_lulusan = id_lulusan;
    }

    public String getJenis_p2m() {
        return jenis_p2m;
    }

    public void setJenis_p2m(String jenis_p2m) {
        this.jenis_p2m = jenis_p2m;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    @Override
    public String toString() {
        return "p2m{" + "id_p2m=" + id_p2m + ", id_lulusan=" + id_lulusan + ", jenis_p2m=" + jenis_p2m + ", tempat=" + tempat + '}';
    }
    
}
