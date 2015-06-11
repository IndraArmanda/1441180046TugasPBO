package com.company;

/**
 * Created by C55D on 6/11/2015.
 */
public class jam {

    private String merekJam;
    private double hargaJam;
    private String warnaJam;

    public jam() {
    }

    public jam(String merekJam, double hargaJam, String warnaJam) {
        this.merekJam = merekJam;
        this.hargaJam = hargaJam;
        this.warnaJam = warnaJam;
    }

    public String getMerekJam() {
        return merekJam;
    }

    public void setMerekJam(String merekJam) {
        this.merekJam = merekJam;
    }

    public double getHargaJam() {
        return hargaJam;
    }

    public void setHargaJam(double hargaJam) {
        this.hargaJam = hargaJam;
    }

    public String getWarnaJam() {
        return warnaJam;
    }

    public void setWarnaJam(String warnaJam) {
        this.warnaJam = warnaJam;
    }

    @Override
    public String toString() {
        return "jam{" +
                "merekJam='" + merekJam + '\'' +
                ", hargaJam=" + hargaJam +
                ", warnaJam='" + warnaJam + '\'' +
                '}';
    }
}
