/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

import java.util.Date;

public class taxi {
    private String namap, namad, tanggal;
    private int jarak, tarif;

    public String getNamap() {
        return namap;
    }

    public void setNamap(String namap) {
        this.namap = namap;
    }

    public String getNamad() {
        return namad;
    }

    public void setNamad(String namad) {
        this.namad = namad;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }
    
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    taxi(){
    }
    
    public int biaya(){
        int total;
        if (jarak > 10) {
            total = jarak * 3500 + 5000;
        }
        else if (jarak > 20) {
            total = (jarak-10 * 2500) + 40000;
        }
        else{
            total = (jarak-20 * 2000) + 65000;
        }
        return total;
    }

}
