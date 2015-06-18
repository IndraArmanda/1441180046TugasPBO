package com.company;

/**
 * Created by C55D on 6/17/2015.
 */
public class nasabah {
    private  String nama;
    private  rekening akun;

    public nasabah(String nama, rekening akun) {
        this.nama = nama;
        this.akun = akun;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public rekening getAkun() {
        return akun;
    }

    public void setAkun(rekening akun) {

        this.akun = akun;
    }

    @Override
    public String toString() {
        return "nasabah{" +
                "nama='" + nama + '\'' +
                ", akun=" + akun +
                '}';
    }
}
