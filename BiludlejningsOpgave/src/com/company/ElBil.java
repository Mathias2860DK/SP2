package com.company;

public class ElBil extends Bil {
    private int batteriKapacitetKWh;
    private int maxKm;
    private int whPrKm;
    public ElBil(String regNr, String maerke, int aargang, int antalDore, int batteriKapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, maerke, aargang, antalDore);
        this.batteriKapacitetKWh = batteriKapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }

    public void setBatteriKapacitetKWh(int batteriKapacitetKWh) {
        this.batteriKapacitetKWh = batteriKapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return  "ElBil:    " + " regNr: " + getRegNr() + ", mærke: " + getMaerke() +
                " ,Årgang: " + getAargang() + ", antal døre: " + getAntalDore() +
                ", batteriKapacitetKWh: " + batteriKapacitetKWh + ", maxKm: " + maxKm + ", whPrKm: " + whPrKm + "\n";

    }

    @Override
    public double beregnGrønEjerAfgift() {
        double kmPrl;
        double grønEjerAfgift;
kmPrl = 100/(whPrKm/91.25);
        if (kmPrl >= 20 && kmPrl < 50){
            grønEjerAfgift = 330;
            return grønEjerAfgift;
        } else if (kmPrl >= 15 && kmPrl < 20){
            grønEjerAfgift = 1050;
            return grønEjerAfgift;
        } else if (kmPrl >= 10 && kmPrl < 15){
            grønEjerAfgift = 2340;
            return grønEjerAfgift;
        } else if (kmPrl >= 5 && kmPrl < 10){
            grønEjerAfgift = 5500;
            return grønEjerAfgift;
        } else if (kmPrl < 5 && kmPrl >0){
            grønEjerAfgift = 10470;
            return grønEjerAfgift;
        } else{
            System.out.println("Ugyldigt");
            return 0;
        }

    }
}
