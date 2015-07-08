package com.company;

/**
 * Created by C55D on 7/1/2015.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Liga italy = new Liga("Italy");
        Divisi serieA = new Divisi("Serie A");
        Divisi serieB = new Divisi("Serie B");

        Klub juventus = new Klub("Juventus",serieA);
        Klub acMilan = new Klub("AC Milan",serieB);

        italy.setDaftarDivisi(serieA);
        italy.setDaftarDivisi(serieB);

        italy.setDaftarKlub(juventus);
        italy.setDaftarKlub(acMilan);

        serieA.setDaftarKlub(juventus);
        serieB.setDaftarKlub(acMilan);

        System.out.println("Liga : " +italy.getNamaLiga());
        System.out.println("Divisi : " +italy.getDaftarDivisi());

        System.out.println("\n");

        System.out.println("Liga : " +italy.getNamaLiga());
        System.out.println("Klub : " +italy.getDaftarKlub());

        System.out.println("\n");

        System.out.println("Liga : " +italy.getNamaLiga());
        System.out.println("Klub : " +serieA.getDaftarKlub());

        System.out.println("\n");

        System.out.println("Liga : " +italy.getNamaLiga());
        System.out.println("Klub : " +serieB.getDaftarKlub());

        System.out.println("\n");

        System.out.println("Liga : " + juventus.getLiga());
        System.out.println("Klub : " + juventus.getNamaKlub());
        System.out.println("Devisi : " + juventus.getDivisi());

        System.out.println("\n");

        System.out.println("Liga : " + acMilan.getLiga());
        System.out.println(("Klub : " + acMilan.getNamaKlub()));
        System.out.println("Devisi : " + acMilan.getDivisi());

        System.out.println("\n");
    }
}
