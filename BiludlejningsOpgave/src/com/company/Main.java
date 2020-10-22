package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BenzinBil bil1 = new BenzinBil("AB23432","Audi RS6",2019,4,100,8);
        DiselBil bil2 = new DiselBil("QK12325","BMW 530d",2018,4,true,18);
        ElBil bil3 = new ElBil("AK84141","Audi e-tron 55",2019,4,95,410,229);

        Garage garage1 = new Garage();
        garage1.tilFoejBil(bil1);
        garage1.tilFoejBil(bil2);
        garage1.tilFoejBil(bil3);
        //System.out.println(garage1);
        garage1.format();
        System.out.println("for benzinbilen(erne) er grøn ejer afgift:" + bil1.beregnGrønEjerAfgift());
        System.out.println("for diselbilen(erne) er grøn ejer afgift:" + bil2.beregnGrønEjerAfgift());
        System.out.println("for elbilen(erne) er grøn ejer afgift:" + bil3.beregnGrønEjerAfgift());
        System.out.println("Den samlede grønne afgift for alle billerne i garagen er: " + garage1.beregnGrønAfgiftForBilpark() + " kr.");

    }
}
