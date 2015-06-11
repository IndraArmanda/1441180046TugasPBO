package com.company;

/**
 * Created by C55D on 6/11/2015.
 */
public class pemilik {

    private String namaPemilik;
    private String alamatPemilik;
    private char jenisKelaminPemilik;
    private int tinggiBadanPemilik;

    public pemilik() {
    }

    public pemilik(String namaPemilik, String alamatPemilik, char jenisKelaminPemilik, int tinggiBadanPemilik) {
        this.namaPemilik = namaPemilik;
        this.alamatPemilik = alamatPemilik;
        this.jenisKelaminPemilik = jenisKelaminPemilik;
        this.tinggiBadanPemilik = tinggiBadanPemilik;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getAlamatPemilik() {
        return alamatPemilik;
    }

    public void setAlamatPemilik(String alamatPemilik) {
        this.alamatPemilik = alamatPemilik;
    }

    public char getJenisKelaminPemilik() {
        return jenisKelaminPemilik;
    }

    public void setJenisKelaminPemilik(char jenisKelaminPemilik) {
        this.jenisKelaminPemilik = jenisKelaminPemilik;
    }

    public int getTinggiBadanPemilik() {
        return tinggiBadanPemilik;
    }

    public void setTinggiBadanPemilik(int tinggiBadanPemilik) {
        this.tinggiBadanPemilik = tinggiBadanPemilik;
    }

    @Override
    public String toString() {
        return "pemilik{" +
                "namaPemilik='" + namaPemilik + '\'' +
                ", alamatPemilik='" + alamatPemilik + '\'' +
                ", jenisKelaminPemilik=" + jenisKelaminPemilik +
                ", tinggiBadanPemilik=" + tinggiBadanPemilik +
                '}';
    }
}
