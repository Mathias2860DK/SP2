package com.company;

public abstract class Bil {
    private String regNr;
    private String maerke;
    private int aargang;
    private int antalDore;

    public Bil(String regNr, String maerke, int aargang, int antalDore) {
        this.regNr = regNr;
        this.maerke = maerke;
        this.aargang = aargang;
        this.antalDore = antalDore;
    }

    public abstract double beregnGrønEjerAfgift();

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMaerke() {
        return maerke;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public int getAargang() {
        return aargang;
    }

    public void setAargang(int aargang) {
        this.aargang = aargang;
    }

    public int getAntalDore() {
        return antalDore;
    }

    public void setAntalDore(int antalDore) {
        this.antalDore = antalDore;
    }


}
