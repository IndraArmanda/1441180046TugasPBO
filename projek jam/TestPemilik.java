package com.company;

/**
 * Created by C55D on 6/11/2015.
 */
public class TestPemilik {

    public static void main(String[] args) {

        pemilik indra = new pemilik("indra","blitar",'L',170);
        System.out.println(indra.getNamaPemilik());
        System.out.println(indra.getAlamatPemilik());
        System.out.println(indra.getJenisKelaminPemilik());
        System.out.println(indra.getTinggiBadanPemilik());

        jam Digitech = new jam("Digitech",25000.0,"Hitam");
        System.out.println(Digitech.getMerekJam());
        System.out.println(Digitech.getHargaJam());
        System.out.println(Digitech.getWarnaJam());

    }
}

