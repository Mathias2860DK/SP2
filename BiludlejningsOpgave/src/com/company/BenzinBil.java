package com.company;

public class BenzinBil extends Bil {
    private int oktantal;
    private int kmPrl;

    public BenzinBil(String regNr, String maerke, int aargang, int antalDore, int oktantal, int kmPrl) {
        super(regNr, maerke, aargang, antalDore);
        this.kmPrl = kmPrl;
        this.oktantal = oktantal;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public int getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "BenzinBil:" + " regNr: " + getRegNr() + ", mærke: " + getMaerke() +
                "       ,Årgang: " + getAargang() + ", antal døre: " + getAntalDore() +
                ", kmPrl: " + kmPrl + ", oktantal: " + oktantal +  "\n";

    }

    @Override
    public double beregnGrønEjerAfgift() {
        double grønEjerAfgift;
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
            System.out.println("Ugyldig kmPrl. Skriv i range 1 til 49");
            return 0;
        }

    }
}
