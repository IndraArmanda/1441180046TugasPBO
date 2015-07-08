package com.company;

import java.util.ArrayList;

/**
 * Created by C55D on 6/30/2015.
 */
public class Divisi {
    private String namaDivisi;
    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();

    public Divisi(String namaDivisi) {

        this.namaDivisi = namaDivisi;
    }

    public String getNamaDivisi() {

        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {

        this.namaDivisi = namaDivisi;
    }

    public ArrayList<Klub> getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub(Klub klub) {
        this.daftarKlub.add(klub);
    }

    @Override
    public String toString() {
        return "Divisi{" +
                "namaDivisi='" + namaDivisi + '\'' +
                '}';
    }
}
