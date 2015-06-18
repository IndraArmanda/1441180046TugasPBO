package com.company;

/**
 * Created by C55D on 6/17/2015.
 */
public class testUnit {

    public static void main(String[] agrs)  {

//       buat objek rekening


        rekening aa = new rekening(20000000.0);
        nasabah bb = new nasabah("Indra",aa);
        System.out.println(bb.toString());
        bb.setAkun(aa);
        System.out.println(bb.toString());

        aa.tarik(10000000.0);
        System.out.println("Tarik 10.000.000");
        System.out.println("Saldo Sekarang :" +aa.getSaldo());

        aa.setor(5000000.0);
        System.out.println("setor 5000000");
        System.out.println("saldo sekarang :" +aa.getSaldo());
    }
}
