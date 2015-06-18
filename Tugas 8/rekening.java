package com.company;

/**
 * Created by C55D on 6/17/2015.
 */
public class rekening {
    private double saldo;

    public rekening(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "rekening{" +
                "saldo=" + saldo +
                '}';
    }

    public void tarik(double tarik){
        this.saldo = saldo - tarik;
    }

    public  void setor(double setor){
        this.saldo = saldo + setor;
    }
}
