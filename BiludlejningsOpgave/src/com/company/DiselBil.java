package com.company;

public class DiselBil extends Bil {
    private boolean harPartikelFilter;
    private int kmPrl;
    public DiselBil(String regNr, String maerke, int aargang, int antalDore, boolean harPartikelFilter, int kmPrl) {
        super(regNr, maerke, aargang, antalDore);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrl = kmPrl;
    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public int getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "DiselBil: "  + " regNr: " + getRegNr() + ", mærke: " + getMaerke() +
                "       ,Årgang: " + getAargang() + ", antal døre: " + getAntalDore() +
                ", kmPrl: " + kmPrl + ", harPartikelFilter: " + harPartikelFilter + "\n";

    }

    @Override
    public double beregnGrønEjerAfgift() {
        double grønEjerAfgift;
        double udlingsAfgift;
        double partikelUdledningsAfgift = 1000;

        if (kmPrl >= 20 && kmPrl < 50){
            udlingsAfgift = 130;
            grønEjerAfgift = 330 + udlingsAfgift;
            if (harPartikelFilter == false){
                grønEjerAfgift = grønEjerAfgift + partikelUdledningsAfgift;
            }
            return grønEjerAfgift;
        } else if (kmPrl >= 15 && kmPrl < 20){
            udlingsAfgift = 1390;
            grønEjerAfgift = 1050 + udlingsAfgift;

            if (harPartikelFilter == false){
                grønEjerAfgift = grønEjerAfgift + partikelUdledningsAfgift;
            }
            return grønEjerAfgift;
        } else if (kmPrl >= 10 && kmPrl < 15){
            udlingsAfgift = 1850;
            grønEjerAfgift = 2340 + udlingsAfgift;
            if (harPartikelFilter == false){
                grønEjerAfgift = grønEjerAfgift + partikelUdledningsAfgift;
            }

            return grønEjerAfgift;
        } else if (kmPrl >= 5 && kmPrl < 10){
            udlingsAfgift = 2770;
            grønEjerAfgift = 5500 + udlingsAfgift;
            if (harPartikelFilter == false){
                grønEjerAfgift = grønEjerAfgift + partikelUdledningsAfgift;
            }
            return grønEjerAfgift;
        } else if (kmPrl < 5 && kmPrl >0){
            udlingsAfgift = 15260;
            grønEjerAfgift = 10470 + udlingsAfgift;
            if (harPartikelFilter == false){
                grønEjerAfgift = grønEjerAfgift + partikelUdledningsAfgift;
            }

            return grønEjerAfgift;
        } else{
            System.out.println("Ugyldig kmPrl");
            return 0;
        }


    }
}
