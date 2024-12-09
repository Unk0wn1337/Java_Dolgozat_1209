package hu.szamalk;

import java.util.ArrayList;
import java.util.Random;


public class Adatszerkezet {
    private String[] nev;
    private String[] randomBetuk;
    private static Random rnd;

    public Adatszerkezet() {
        this.nev = new String[5];
        this.randomBetuk = new String[9];
        nevBedrotozas();
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





}
