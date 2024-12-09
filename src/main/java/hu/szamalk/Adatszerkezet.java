package hu.szamalk;

import java.util.ArrayList;
import java.util.Random;


public class Adatszerkezet {
    private String[] nev;
    private String[] randomBetuk;
    private static Random rnd;

    public Adatszerkezet() {
        this.nev = new String[5];
        this.randomBetuk = new String[10];
        nevBedrotozas();
        abcBedrotoz();
    }

    public void nevBedrotozas(){
        nev[0] = "K";
        nev[1] = "e";
        nev[2] = "n";
        nev[3] = "d";
        nev[4] = "e";
    }


    public String nevMegjelenit(){
        String f = "";
        for(int i = 0; i < nev.length; i++){
            if(i == 0){
                f += nev[i];
            } else {
                f += ",";
                f += nev[i];
            }
        }
        return f;
    }

    public void abcBedrotoz(){
        randomBetuk[0] = "A";
        randomBetuk[1] = "J";
        randomBetuk[2] = "C";
        randomBetuk[3] = "L";
        randomBetuk[4] = "L";
        randomBetuk[5] = "C";
        randomBetuk[6] = "Z";
        randomBetuk[7] = "V";
        randomBetuk[8] = "Z";
        randomBetuk[9] = "Z";

    }


    public String randomBetukMegjelent(){
        String f = "";
        for(int i = 0; i < randomBetuk.length; i++){
            if(i == 0){
                f += randomBetuk[i];
            } else {
                f += ",";
                f += randomBetuk[i];
            }
        }
        return f;
    }

    





}
