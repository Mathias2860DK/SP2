package com.company;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Garage {
    //arayList til at gemme bilerne i arrayList af datatypen Bil.
    ArrayList<Bil> bilPark = new ArrayList<>();

    public void tilFoejBil (Bil bil){
        bilPark.add(bil);
    }

    public double beregnGrønAfgiftForBilpark(){
        double grønEjerAfgiftForBilpark = 0;

     /*   for (Bil dennebil: bilPark){
            grønEjerAfgiftForBilpark += dennebil.beregnGrønEjerAfgift();
        }*/

        for (int i = 0; i < bilPark.size(); i++){
            grønEjerAfgiftForBilpark += bilPark.get(i).beregnGrønEjerAfgift();
        }

        return grønEjerAfgiftForBilpark;
    }
// får bilerne printet pænere ud.
    public void format() {
        System.out.println(bilPark.stream().map(i -> i.toString()).collect(Collectors.joining("")));
    }


    @Override
    //denne metode bruges kun ved sout af instanser af Garageklassen.
    //Hvis vi bruger vores "format" metode, behøver denne metode ikke være her.
    public String toString() {
        return "Garage: " + bilPark;
    }
}
